package com.saltedfish.algorithms;

public class LeetCode1281 {
    class Solution {
        public int subtractProductAndSum(int n) {
            int product = 1;
            int sum = 0;

            while (n > 0) {
                int num = n % 10;
                n /= 10;
                product *= num;
                sum += num;
            }
            return product - sum;
        }
    }
}
