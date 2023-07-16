package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/4/28
 */
public class LeetCode0633 {
    class Solution {
        public boolean judgeSquareSum(int c) {
            for (long a = 0; a * a <= c; ++a) {
                double b = Math.sqrt(c - a * a);
                if (b == (int) b) {
                    return true;
                }
            }
            return false;
        }
    }
}
