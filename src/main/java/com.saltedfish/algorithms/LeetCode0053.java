package com.saltedfish.algorithms;

public class LeetCode0053 {
    class Solution {
        public int maxSubArray(int[] nums) {
            int n = nums.length;
            int res = nums[0];
            for (int i = 1; i < nums.length; ++i) {
                if (nums[i-1] > 0)
                    nums[i] += nums[i-1];
                res = Math.max(nums[i], res);
            }
            return res;
        }
    }
}
