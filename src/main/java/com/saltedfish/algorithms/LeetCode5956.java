package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/12/19
 */
public class LeetCode5956 {
    class Solution {

        public boolean isPalindrome(String s) {
            int l = s.length() / 2;
            for (int i = 0; i < l; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    return false;
                }
            }
            return true;
        }

        public String firstPalindrome(String[] words) {
            for (String word : words) {
                if (isPalindrome(word)) {
                    return word;
                }
            }
            return "";
        }
    }
}
