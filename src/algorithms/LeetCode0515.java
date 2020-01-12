package src.algorithms;

import src.algorithms.baseclass.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode0515 {

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
        public List<Integer> largestValues(TreeNode root) {
            List<Integer> res = new ArrayList<>();

            Queue<TreeNode> queue = new LinkedList<>();
            if (root == null)
                return res;
            queue.offer(root);

            while (!queue.isEmpty()) {
                int max = queue.peek().val;
                for (int i = queue.size()-1; i >= 0; --i) {
                    TreeNode node = queue.poll();
                    max = Math.max(max, node.val);
                    if (node.left != null)  queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
                res.add(max);
            }
            return res;
        }
    }

}
