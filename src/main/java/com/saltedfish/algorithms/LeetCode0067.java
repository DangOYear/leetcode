package com.saltedfish.algorithms;

public class LeetCode0067 {
    class Solution {
        public String addBinary(String a, String b) {
            StringBuilder stringBuilder = new StringBuilder();
            int n = Math.max(a.length(), b.length());
            int carry = 0;
            for (int i = 0; i < n; ++i) {
                carry += i < a.length() ? (a.charAt(a.length() - i - 1) - '0') : 0;
                carry += i < b.length() ? (b.charAt(b.length() - i - 1) - '0') : 0;
                stringBuilder.append((char)(carry % 2 + '0'));
                carry /= 2;
            }
            if (carry > 0) {
                stringBuilder.append('1');
            }
            return stringBuilder.reverse().toString();
        }
    }
}
