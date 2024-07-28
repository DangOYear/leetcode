package com.saltedfish.contest.the408th;

public class LeetCode100377 {
    class Solution {
        public boolean canAliceWin(int[] nums) {
            int lessThenTenSum = 0;
            int sum = 0;
            for (int n : nums) {
                if (n < 10) {
                    lessThenTenSum += n;
                }
                sum += n;
            }
            return sum - lessThenTenSum != lessThenTenSum;
        }
    }
}
