package com.saltedfish.algorithms;


import src.algorithms.baseclass.TreeNode;

public class LeetCode0654 {
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
        public TreeNode construct(int[] nums, int left, int right) {
            if (left == right)
                return null;

            int max_pos = max(nums, left, right);
            TreeNode root = new TreeNode(nums[max_pos]);

            root.left = construct(nums, left, max_pos);
            root.right = construct(nums, max_pos + 1, right);
            return root;
        }

        public int max(int[] nums, int left, int right) {
            int max_pos = left;

            for (int i = left; i < right; i++) {
                if (nums[i] > nums[max_pos])
                    max_pos = i;
            }
            return max_pos;
        }

        public TreeNode constructMaximumBinaryTree(int[] nums) {
            return construct(nums, 0, nums.length);
        }


    }
}
