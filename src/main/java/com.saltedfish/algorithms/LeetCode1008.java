package com.saltedfish.algorithms;


import com.saltedfish.baseclass.TreeNode;

public class LeetCode1008 {

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

        public TreeNode bstFromPreorder(int[] preorder) {
            return build(preorder, 0, preorder.length - 1);
        }

        public TreeNode build(int[] preorder, int left, int right) {
            if (left > right)
                return null;
            int mid = preorder[left];
            TreeNode root = new TreeNode(mid);

            int i;
            for (i = left + 1; i <= right; ++i) {
                if (preorder[i] > mid)
                    break;
            }

            root.left = build(preorder, left + 1, i-1);
            root.right = build(preorder, i, right);

            return root;
        }
    }
}
