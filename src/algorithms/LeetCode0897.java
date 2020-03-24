package src.algorithms;

import src.algorithms.baseclass.TreeNode;

public class LeetCode0897 {
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
        TreeNode current;
        public TreeNode increasingBST(TreeNode root) {
            TreeNode res = new TreeNode(0);
            current = res;
            inorder(root);
            return res.right;
        }

        public void inorder(TreeNode node) {
            if (node == null)
                return;
            inorder(node.left);

            node.left = null;
            current.right = node;
            current = node;
            inorder(node.right);
        }
    }
}
