package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/5/4
 */
public class LeetCode1844 {
    class Solution {
        public String replaceDigits(String s) {
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    res.append((char)(s.charAt(i-1) + s.charAt(i) - '0'));
                } else {
                    res.append(s.charAt(i));
                }
            }
            return res.toString();
        }


    }
}
