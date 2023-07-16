package com.saltedfish.algorithms;

public class LeetCode0908 {
    class Solution {
        public int smallestRangeI(int[] A, int K) {
            int minNum = A[0];
            int maxNum = A[0];
            for (int num : A) {
                minNum = Math.min(minNum, num);
                maxNum = Math.max(maxNum, num);
            }
            return Math.max(0, maxNum - minNum - 2 * K);
        }
    }
}
