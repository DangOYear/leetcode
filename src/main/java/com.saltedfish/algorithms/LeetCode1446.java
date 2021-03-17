package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/17
 */
public class LeetCode1446 {
    class Solution {
        public int maxPower(String s) {
            int res = 0;
            int i = 0;
            while (i < s.length()) {
                int j = i;
                while (j < s.length()) {
                    if (s.charAt(i) == s.charAt(j)) {
                        ++j;
                    } else {
                        break;
                    }
                }
                res = Math.max(j - i, res);
                i = j;
            }
            return res;
        }
    }
}
