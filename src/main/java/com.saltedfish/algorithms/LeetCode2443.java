package com.saltedfish.algorithms;

public class LeetCode2443 {
    class Solution {

        public int reverseNum(int x) {
            String reverseStr = new StringBuilder(String.valueOf(x)).reverse().toString();
            int res = Integer.parseInt(reverseStr);
            return res;
        }

        public boolean sumOfNumberAndReverse(int num) {
            for (int i = 0; i <= num; i++) {
                if (i + reverseNum(i) == num) {
                    return true;
                }
            }
            return false;
        }
    }
}
