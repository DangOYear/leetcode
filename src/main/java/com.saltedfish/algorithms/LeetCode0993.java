package com.saltedfish.algorithms;


import com.saltedfish.baseclass.TreeNode;

public class LeetCode0993 {
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


        private int x;
        private TreeNode xParent;
        private int xDepth;
        private boolean xFound;

        private int y;
        private TreeNode yParent;
        private int yDepth;
        private boolean yFound;

        public boolean isCousins(TreeNode root, int x, int y) {
            this.x = x;
            this.y = y;
            dfs(root, 0, null);
            return xDepth == yDepth && xParent != yParent;
        }

        private void dfs(TreeNode node, int depth, TreeNode parent) {
            if (node == null) {
                return;
            }

            if (node.val == x) {
                xParent = parent;
                xDepth = depth;
                xFound = true;
            } else if (node.val == y) {
                yParent = parent;
                yDepth = depth;
                yFound = true;
            }

            if (xFound && yFound) {
                return;
            }

            dfs(node.left, depth + 1, node);

            if (xFound && yFound) {
                return;
            }

            dfs(node.right, depth + 1, node);
        }
    }
}
