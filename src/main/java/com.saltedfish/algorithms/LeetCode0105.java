package com.saltedfish.algorithms;

import src.algorithms.baseclass.TreeNode;

public class LeetCode0105 {
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

        public TreeNode build(int[] preorder, int preL, int preR, int[] inorder, int inL, int inR) {
            if (preL > preR)
                return null;

            if (preL == preR) {
                return new TreeNode(preorder[preL]);
            }
            int i;
            TreeNode root = null;
            for (i = inL; i <= inR; ++i) {
                if (inorder[i] == preorder[preL]) {
                    root = new TreeNode(preorder[preL]);
                    break;
                }
            }

            root.left = build(preorder, preL + 1, i + preL - inL, inorder, inL, i - 1);
            root.right = build(preorder, preR - inR + i + 1, preR, inorder, i + 1, inR);
            return root;
        }

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            TreeNode root = build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
            return root;
        }
    }
}
