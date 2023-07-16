package com.saltedfish.algorithms;

public class LeetCode1796 {
    class Solution {
        public int secondHighest(String s) {
            int first = -1, second = -1;
            for (char ch : s.toCharArray()) {
                if (!Character.isDigit(ch)) {
                    continue;
                }
                int num = ch - '0';
                if (num > first) {
                    second = first;
                    first = num;
                } else {
                    if (num > second && num < first) {
                        second = num;
                    }
                }
            }
            return second;
        }
    }
}
