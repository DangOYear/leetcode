package com.saltedfish.algorithms;


import com.saltedfish.baseclass.TreeNode;

public class LeetCode1038 {
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
        private int val;
        public TreeNode bstToGst(TreeNode root) {

            val = 0;
            dfs(root);
            return root;
        }

        public void dfs(TreeNode node) {
            if (node != null) {
                dfs(node.right);
                val += node.val ;
                node.val = val;
                dfs(node.left);

            }
        }
    }
}
