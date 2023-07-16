package com.saltedfish.algorithms;

public class LeetCode0172 {
    class Solution {
        public int trailingZeroes(int n) {
            int zeroCount = 0;
            long currentMul = 5;
            while (n >= currentMul) {
                zeroCount += (n / currentMul);
                currentMul *= 5;
            }
            return zeroCount;
        }
    }
}
