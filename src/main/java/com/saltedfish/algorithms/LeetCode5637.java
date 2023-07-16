package com.saltedfish.algorithms;

public class LeetCode5637 {
    class Solution {
        public boolean halvesAreAlike(String s) {
            int mid = s.length() / 2;
            return countVowel(s.substring(0, mid))
                    == countVowel(s.substring(mid));
        }

        public int countVowel(String str) {
            int res = 0;
            for (int i = 0; i < str.length(); ++i) {
                char ch = str.charAt(i);
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'
                        || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    ++res;
                }
            }
            return res;
        }
    }
}
