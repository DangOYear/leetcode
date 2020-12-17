package com.saltedfish.algorithms;

import src.algorithms.baseclass.TreeNode;

public class LeetCode0222 {
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
        public int countNodes(TreeNode root) {
            return root == null ? 0 : 1 + countNodes(root.left) + countNodes(root.right);
        }
    }
}
