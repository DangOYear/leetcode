package com.saltedfish.algorithms;

public class LeetCode0343 {
    class Solution {
        public int integerBreak(int n) {
            if (n == 2) {
                return 1;
            }
            if (n == 3) {
                return 2;
            }

            int mod = 1000000007;
            long res = 1;
            while (n > 4) {
                res *= 3;
                res %= mod;
                n -= 3;
            }
            return (int)(res * n % mod);
        }
    }
}
