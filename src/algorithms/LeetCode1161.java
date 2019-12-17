package src.algorithms;



import src.algorithms.baseclass.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode1161 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public int maxLevelSum(TreeNode root) {
            int level = 0;
            int maxLevelValue = Integer.MIN_VALUE;
            int levelCount = 0;
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {
                int levelValue = 0;
                ++levelCount;
                for (int i = queue.size()-1; i >= 0; --i) {
                    TreeNode node = queue.poll();
                    levelValue += node.val;
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }

                if (levelValue > maxLevelValue) {
                    maxLevelValue = levelValue;
                    level = levelCount;
                }
            }
            return level;

        }
    }
}
