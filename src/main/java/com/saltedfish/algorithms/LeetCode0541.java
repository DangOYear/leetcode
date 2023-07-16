package com.saltedfish.algorithms;

public class LeetCode0541 {
    class Solution {
        public String reverseStr(String s, int k) {
            char[] charArr = s.toCharArray();
            for (int start = 0; start < s.length(); start += 2 * k) {
                int i = start;
                int j = Math.min(start + k - 1, s.length() - 1);
                while (i < j) {
                    char ch = charArr[i];
                    charArr[i] = charArr[j];
                    charArr[j] = ch;
                    ++i;
                    --j;
                }
            }
            return new String(charArr);
        }
    }
}
