package com.saltedfish.algorithms;

public class LeetCode6245 {
    class Solution {
        public int pivotInteger(int n) {
            for (int i = 1; i <= n; i++) {
                if ( ((1 + i) * (i) / 2) == (i + n) * (n-i+1) / 2) {
                    return i;
                }
            }
            return -1;
        }
    }
}
