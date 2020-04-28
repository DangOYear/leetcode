package src.algorithms;

import src.algorithms.baseclass.TreeNode;

public class LeetCode0124 {
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
        int res = Integer.MIN_VALUE;

        public int sideMax(TreeNode root) {
            if (root == null)   return 0;
            int left = Math.max(sideMax(root.left), 0);
            int right = Math.max(sideMax(root.right), 0);
            res = Math.max(res, left + right + root.val);
            return Math.max(left, right) + root.val;
        }

        public int maxPathSum(TreeNode root) {
            sideMax(root);
            return res;
        }
    }

}
