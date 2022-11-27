package com.saltedfish.algorithms;

public class LeetCode6246 {
    class Solution {
        public int appendCharacters(String s, String t) {
            int sLen = s.length();
            int tLen = t.length();

            int i = 0;
            int j = 0;
            while (i < tLen && j < sLen) {
                if (t.charAt(i) == s.charAt(j)) {
                    j++;
                    i++;
                } else {
                    j++;
                }
            }

            return tLen - i;
        }
    }
}
