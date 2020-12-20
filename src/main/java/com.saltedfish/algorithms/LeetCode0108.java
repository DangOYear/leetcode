package com.saltedfish.algorithms;


import com.saltedfish.baseclass.TreeNode;

public class LeetCode0108 {
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
        int[] data;
        public TreeNode sortedArrayToBST(int[] nums) {
            this.data = nums;
            return solve(0, nums.length - 1);
        }

        public TreeNode solve(int left, int right) {
            if (left > right)   return null;

            int mid = (left + right) / 2;

            TreeNode root = new TreeNode(data[mid]);
            root.left = solve(left, mid - 1);
            root.right = solve(mid + 1, right);

            return root;
        }
    }

}
