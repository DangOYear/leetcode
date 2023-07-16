package com.saltedfish.algorithms;

public class LeetCode0258 {
    class Solution {
        public int addDigits(int num) {
            while (num / 10 >= 1) {
                num = cal(num);
            }
            return num;
        }

        public int cal(int n) {
            int res = 0;
            while (n > 0) {
                res += n % 10;
                n /= 10;
            }
            return res;
        }
    }
}
