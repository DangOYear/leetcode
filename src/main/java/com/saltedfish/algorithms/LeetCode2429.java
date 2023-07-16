package com.saltedfish.algorithms;

public class LeetCode2429 {
    class Solution {
        public int minimizeXor(int num1, int num2) {
            int biCnt1 = Integer.bitCount(num1);
            int biCnt2 = Integer.bitCount(num2);
            while (biCnt2 < biCnt1) {
                num1 = num1 & (num1 - 1);
                ++biCnt2;
            }

            while (biCnt1 < biCnt2) {
                num1 = num1 | (num1 + 1);
                ++biCnt1;
            }

            return num1;
        }
    }
}
