package com.saltedfish.algorithms;

public class LeetCode0202 {
    class Solution {
        public boolean isHappy(int n) {
            int slow = n;
            int fast = n;
            do {
                slow = calculate(slow);
                fast = calculate(calculate(fast));
            }while (slow != fast);
            return slow == 1 ? true : false;
        }

        public int calculate(int num) {
            int res = 0;
            while (num > 0) {
                res += Math.pow(num % 10, 2);
                num /= 10;
            }
            return res;
        }
    }
}
