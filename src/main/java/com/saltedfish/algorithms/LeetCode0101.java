package com.saltedfish.algorithms;


import com.saltedfish.baseclass.TreeNode;

public class LeetCode0101 {
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
        public boolean isSymmetric(TreeNode root) {
            return isMirror(root, root);
        }

        public boolean isMirror(TreeNode node1, TreeNode node2) {
            if (node1 == null && node2 == null) {
                return true;
            }

            if (node1 == null || node2 == null) {
                return false;
            }

            return (node1.val == node2.val) && isMirror(node1.left, node2.right)
                   && isMirror(node1.right, node2.left);


        }
    }
}
