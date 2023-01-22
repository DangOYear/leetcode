package com.saltedfish.contest;

public class LeetCode6278 {
    class Solution {
        public int countDigits(int num) {
            int res = 0;
            int temp = num;
            while (temp != 0) {
                int n = temp % 10;
                if (num % n == 0) {
                    res++;
                }
                temp /= 10;
            }
            return res;
        }
    }
}
