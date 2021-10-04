package com.saltedfish.algorithms;

public class LeetCode2027 {
    class Solution {
        public int minimumMoves(String s) {
            int res = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'X') {
                    i += 2;
                    ++res;
                }
            }
            return res;
        }
    }
}
