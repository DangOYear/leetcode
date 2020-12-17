package com.saltedfish.algorithms;

public class LeetCode0198 {
    class Solution {
        public int rob(int[] nums) {
            int curMax = 0;
            int preMax = 0;
            for (int x:nums) {
                int temp = curMax;
                curMax = Math.max(preMax + x, curMax);
                preMax = temp;
            }
            return curMax;
        }

    }
}
