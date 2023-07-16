package com.saltedfish.algorithms;

import java.util.Map;

public class LeetCode0409 {
    class Solution {
        public int longestPalindrome(String s) {
            int[] count = new int[128];
            int res = 0;
            for (char ch:s.toCharArray()) {
                count[ch]++;
            }
            boolean hasEven = false;

            for (int value: count) {
                res += value / 2 * 2;
                if (value % 2 == 1)
                    hasEven = true;
            }

            if (hasEven)
                ++res;
            return res;
        }
    }
}
