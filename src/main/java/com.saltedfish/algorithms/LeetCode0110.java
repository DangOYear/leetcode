package com.saltedfish.algorithms;

import src.algorithms.baseclass.TreeNode;

public class LeetCode0110 {
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

        public int height(TreeNode root) {
            if (root == null)
                return 0;
            return 1 + Math.max(height(root.left), height(root.right));

        }


        public boolean isBalanced(TreeNode root) {
            if (root == null)
                return true;

            return Math.abs(height(root.left) - height(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);
        }
    }

}
