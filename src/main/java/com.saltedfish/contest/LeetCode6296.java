package com.saltedfish.contest;

public class LeetCode6296 {
    class Solution {
        public int alternateDigitSum(int n) {

            int res = 0;
            String num = String.valueOf(n);

            int flag = 1;
            for (Character ch : num.toCharArray()) {
                res += (ch - '0') * flag;
                flag = -flag;
            }
            return res;
        }
    }
}
