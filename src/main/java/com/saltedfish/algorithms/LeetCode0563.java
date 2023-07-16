package com.saltedfish.algorithms;

import com.saltedfish.baseclass.TreeNode;

public class LeetCode0563 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode() {}
     *     TreeNode(int val) { this.val = val; }
     *     TreeNode(int val, TreeNode left, TreeNode right) {
     *         this.val = val;
     *         this.left = left;
     *         this.right = right;
     *     }
     * }
     */
    class Solution {
        int tilt = 0;

        public int findTilt(TreeNode root) {
            tilt = 0;
            traverse(root);
            return tilt;
        }

        public int traverse(TreeNode node) {
            if (node == null) {
                return 0;
            }
            int left = traverse(node.left);
            int right = traverse(node.right);
            tilt += Math.abs(left - right);
            return left + right + node.val;
        }

    }
}
