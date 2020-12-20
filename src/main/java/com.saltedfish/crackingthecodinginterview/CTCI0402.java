package com.saltedfish.crackingthecodinginterview;


import com.saltedfish.baseclass.TreeNode;

public class CTCI0402 {
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

        public TreeNode sortedArrayToBST(int[] nums) {

            return constructBST(nums, 0, nums.length - 1);
        }


        public TreeNode constructBST(int[] nums, int L, int R){
            if (L > R)
                return null;

            int mid = (L + R) / 2;
            TreeNode root = new TreeNode(nums[mid]);

            root.left = constructBST(nums, L, mid - 1);
            root.right = constructBST(nums, mid + 1,R);

            return root;

        }
    }
}
