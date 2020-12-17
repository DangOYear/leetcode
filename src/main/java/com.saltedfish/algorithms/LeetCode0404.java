package com.saltedfish.algorithms;


import src.algorithms.baseclass.TreeNode;

public class LeetCode0404 {
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
        int res;
        public int sumOfLeftLeaves(TreeNode root) {
            res = 0;
            dfs(root);
            return res;
        }

        void dfs(TreeNode node) {
            if (node != null) {
                if (node.left != null && node.left.right == null && node.left.left == null)
                    res += node.left.val;
                dfs(node.left);
                dfs(node.right);
            }
        }
    }
}
