package com.saltedfish.algorithms;

public class LeetCode0367 {
    class Solution {
        public boolean isPerfectSquare(int num) {
            int i = 1;
            while (num > 0) {
                num -= i;
                i += 2;
            }

            return num == 0;
        }
    }
}
