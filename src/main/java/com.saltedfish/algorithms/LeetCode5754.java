package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/5/30
 */
public class LeetCode5754 {
    class Solution {
        public int countGoodSubstrings(String s) {
            if (s.length() < 3) {
                return 0;
            }
            int res = 0;
            for (int i = 0; i < s.length() - 2; i++) {
                if (s.charAt(i) != s.charAt(i+1) && s.charAt(i+1) != s.charAt(i+2)
                        && s.charAt(i) != s.charAt(i+2)) {
                    ++res;
                }
            }
            return res;
        }
    }
}
