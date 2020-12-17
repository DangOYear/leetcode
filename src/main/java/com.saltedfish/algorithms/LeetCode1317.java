package com.saltedfish.algorithms;

public class LeetCode1317 {
    class Solution {

        public boolean check(int num) {
            while (num > 0) {
                if (num % 10 == 0)
                    return false;
                num /= 10;
            }
            return true;
        }

        public int[] getNoZeroIntegers(int n) {

            for (int i = 1; i <= n / 2; ++i) {
                if (check(i) && check(n - i)) {
                    return new int[]{i, n - i};
                }
            }
            return null;
        }
    }


}
