package com.saltedfish.algorithms;

import java.util.Arrays;

public class LeetCode1374 {
    class Solution {
        public String generateTheString(int n) {
            StringBuilder stringBuilder = new StringBuilder();
            if (n % 2 == 0) {
                char[] a = new char[n-1];
                Arrays.fill(a, 'a');
                char[] b = new char[1];
                Arrays.fill(b, 'b');
                stringBuilder.append(new String(a));
                stringBuilder.append(new String(b));
            } else {
                char[] a = new char[n];
                Arrays.fill(a, 'a');
                stringBuilder.append(new String(a));
            }
            return stringBuilder.toString();
        }
    }
}
