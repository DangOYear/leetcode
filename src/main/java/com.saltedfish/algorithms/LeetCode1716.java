package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/17
 */
public class LeetCode1716 {
    class Solution {
        public int totalMoney(int n) {
            int res = 0;
            int week = 0;
            int offset = 0;

            for (int i = 0; i < n; i++) {
                week = i / 7;
                offset = i % 7 + 1;
                res += week + offset;
            }
            return res;
        }
    }
}
