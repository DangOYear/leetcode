package com.saltedfish.algorithms;

public class LeetCode1295 {
    class Solution {
        public int findNumbers(int[] nums) {
            int res = 0;
            for (int num : nums) {
                if (Integer.valueOf(num).toString().length() % 2 == 0)
                    ++res;
            }
            return res;
        }
    }
}
