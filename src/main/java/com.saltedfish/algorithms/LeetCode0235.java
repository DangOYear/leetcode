package com.saltedfish.algorithms;

import src.algorithms.baseclass.TreeNode;

public class LeetCode0235 {
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
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null)
                return null;
            if (p.val == q.val)
                return p;
            while (root != null) {
                if (root.val < q.val && root.val < p.val) {
                    root = root.right;
                } else {
                    if (root.val > q.val && root.val > p.val) {
                        root = root.left;
                    }
                    else {
                        return root;
                    }
                }

            }
            return null;
        }
    }
}
