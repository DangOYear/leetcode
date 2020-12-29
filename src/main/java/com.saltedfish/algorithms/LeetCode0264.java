package com.saltedfish.algorithms;

public class LeetCode0264 {
    class Solution {
        public int nthUglyNumber(int n) {
            int[] nums = new int[1690];
            nums[0] = 1;
            int uglyNumber = -1;
            int i2 = 0, i3 = 0, i5 = 0;
            for (int i = 1; i < 1690; ++i) {
                uglyNumber = Math.min(Math.min(nums[i2] * 2, nums[i3] * 3), nums[i5] * 5);
                nums[i] = uglyNumber;
                if (uglyNumber == nums[i2] * 2) {
                    ++i2;
                }

                if (uglyNumber == nums[i3] * 3) {
                    ++i3;
                }

                if (uglyNumber == nums[i5] * 5) {
                    ++i5;
                }
            }
            return nums[n-1];
        }
    }
}
