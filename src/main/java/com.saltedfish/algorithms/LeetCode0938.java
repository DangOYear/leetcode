package com.saltedfish.algorithms;

import src.algorithms.baseclass.TreeNode;

public class LeetCode0938 {
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
        int res;
        public int rangeSumBST(TreeNode root, int L, int R) {
            res = 0;
            dfs(root, L, R);
            return res;
        }

        void dfs(TreeNode node, int L, int R) {
            if (node != null) {
                if (L <= node.val && node.val <= R) {
                    res += node.val;
                }
                if (L < node.val)
                    dfs(node.left, L, R);

                if (node.val < R)
                    dfs(node.right, L, R);
            }
        }

    }
}
