package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/17
 */
public class LeetCode1523 {
    class Solution {
        public int countOdds(int low, int high) {
            return (high + 1) / 2 - low / 2;
        }
    }
}
