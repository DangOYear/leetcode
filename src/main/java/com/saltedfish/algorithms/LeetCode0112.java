package com.saltedfish.algorithms;


import com.saltedfish.baseclass.TreeNode;

public class LeetCode0112 {
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
        private int target;
        public boolean hasPathSum(TreeNode root, int sum) {
            target = sum;
            return dfs(root, 0);
        }

        public boolean dfs(TreeNode root, int count) {

            if (root != null) {
                count += root.val;

                if (count == target && root.left == null && root.right == null) {
                    return true;
                }
                return dfs(root.left, count) | dfs(root.right, count);
            }
            return false;
        }
    }
}
