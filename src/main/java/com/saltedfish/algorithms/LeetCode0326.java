package com.saltedfish.algorithms;

public class LeetCode0326 {
    class Solution {
        public boolean isPowerOfThree(int n) {
            return n > 0 && 1162261467 % n == 0;
        }
    }

}
