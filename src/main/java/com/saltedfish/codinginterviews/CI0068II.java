package com.saltedfish.codinginterviews;


import com.saltedfish.baseclass.TreeNode;

public class CI0068II {
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null || p == root || q == root) return root;

            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if (left != null && right != null) {
                return root;
            }
            return left != null ? left:right;
        }
    }
}
