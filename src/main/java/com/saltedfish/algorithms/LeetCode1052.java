package com.saltedfish.algorithms;

public class LeetCode1052 {
    class Solution {
        public int maxSatisfied(int[] customers, int[] grumpy, int X) {
            int left = 0;
            int right = 0;
            int res = 0;
            int max = 0;
            int temp = 0;
            for (right = 0; right < customers.length; ++right) {
                res += grumpy[right] == 1 ? 0 : customers[right];
                temp += grumpy[right] == 1 ? customers[right] : 0;

                if (right - left + 1 > X) {
                    temp -= grumpy[left] == 1 ? customers[left] : 0;
                    ++left;
                }
                max = Math.max(max, temp);
            }
            return res + max;
        }
    }

}
