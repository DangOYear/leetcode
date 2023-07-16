package com.saltedfish.algorithms;


import com.saltedfish.baseclass.TreeNode;

public class LeetCode0701 {
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
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root == null)
                return new TreeNode(val);

            if (root.val > val)
                root.left = insertIntoBST(root.left, val);
            else
                root.right = insertIntoBST(root.right, val);

            return root;
        }
    }
}
