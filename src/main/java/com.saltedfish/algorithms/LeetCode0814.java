package com.saltedfish.algorithms;


import src.algorithms.baseclass.TreeNode;


public class LeetCode0814 {
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
        public TreeNode pruneTree(TreeNode root) {
            return containsOne(root) ? root : null;
        }

        boolean containsOne(TreeNode node) {
            if (node == null)   return false;
            boolean left = containsOne(node.left);
            boolean right = containsOne(node.right);
            if (!left) node.left = null;
            if (!right) node.right = null;
            return node.val == 1 || left || right;
        }
    }
}
