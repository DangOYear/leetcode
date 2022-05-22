package com.saltedfish.algorithms;

public class LeetCode6074 {
    class Solution {
        public int percentageLetter(String s, char letter) {
            int num = 0;
            for (char ch : s.toCharArray()) {
                if (ch == letter) {
                    ++num;
                }
            }
            return num * 100 / s.length();
        }
    }
}
