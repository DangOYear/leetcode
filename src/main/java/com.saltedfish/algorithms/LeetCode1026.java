package com.saltedfish.algorithms;


import src.algorithms.baseclass.TreeNode;


public class LeetCode1026 {
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
        int rootValue;

        public int maxAncestorDiff(TreeNode root) {
            rootValue = root.val;
            return 1;
        }
    }
}
