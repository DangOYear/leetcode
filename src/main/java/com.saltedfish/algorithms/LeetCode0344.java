package com.saltedfish.algorithms;

import java.util.Arrays;

public class LeetCode0344 {
    class Solution {
        public void reverseString(char[] s) {
            for (int i = 0; i < s.length / 2; i++) {
                char temp = s[i];
                s[i] = s[s.length - 1 - i];
                s[s.length - 1 - i] = temp;
            }
        }
    }
}
