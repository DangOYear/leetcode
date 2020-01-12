package src.algorithms;

import src.algorithms.baseclass.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class LeetCode0637 {
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
        public List<Double> averageOfLevels(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            List<Double> res = new ArrayList<>();

            queue.offer(root);

            while (!queue.isEmpty()) {
                Double levelValue = 0.0;
                int count = queue.size();

                for (int i = count-1; i >= 0; --i) {
                    TreeNode node = queue.poll();
                    levelValue += node.val;
                    if (node.left != null)  queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
                levelValue /= count;
                res.add(levelValue);
            }
            return res;
        }
    }
}
