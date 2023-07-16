package com.saltedfish.crackingthecodinginterview;

public class CTCI1617 {
    class Solution {
        public int maxSubArray(int[] nums) {

            int maxRes = nums[0];
            for (int i = 1; i < nums.length; ++i) {
                if (nums[i-1] > 0) {
                    nums[i] = nums[i-1] + nums[i];
                }
                maxRes = Math.max(nums[i], maxRes);
            }
            return maxRes;
        }
    }
}
