package com.saltedfish.algorithms;

public class LeetCode0136 {
    class Solution {
        public int singleNumber(int[] nums) {
            int res = 0;
            for (int x:nums) {
                res ^= x;
            }
            return res;
        }
    }
}