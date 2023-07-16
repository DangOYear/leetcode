package com.saltedfish.algorithms;

public class LeetCode2427 {
    class Solution {
        public int commonFactors(int a, int b) {
            if (a < b) {
                int temp = b;
                b = a;
                a = temp;
            }
            int count = 0;
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    ++count;
                }
            }

            return count;
        }
    }
}
