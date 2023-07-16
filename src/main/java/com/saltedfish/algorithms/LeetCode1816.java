package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/4/14
 */
public class LeetCode1816 {
    class Solution {
        public String truncateSentence(String s, int k) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    k--;
                }
                if (k == 0) {
                    break;
                }
                stringBuilder.append(s.charAt(i));
            }
            return stringBuilder.toString();
        }
    }
}
