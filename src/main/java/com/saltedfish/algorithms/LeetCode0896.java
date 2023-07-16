package com.saltedfish.algorithms;

public class LeetCode0896 {
    class Solution {
        public boolean isMonotonic(int[] A) {
            boolean isIncreasing = true;
            boolean isDecreasing = true;

            for (int i = 1; i < A.length; ++i) {
                if (A[i] > A[i-1]) {
                    isDecreasing = false;
                }

                if (A[i] < A[i-1]) {
                    isIncreasing = false;
                }
            }

            if (isDecreasing || isIncreasing)
                return true;
            else
                return false;
        }
    }
}
