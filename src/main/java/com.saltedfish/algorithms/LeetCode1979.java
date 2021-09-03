package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/9/3
 */
public class LeetCode1979 {
    class Solution {

        public int gcd(int m, int n) {
            if (m % n == 0) {
                return n;
            }
            return gcd(n, m % n);
        }

        public int findGCD(int[] nums) {
            int minNum = Integer.MAX_VALUE;
            int maxNum = Integer.MIN_VALUE;
            for (int num : nums) {
                minNum = Math.min(minNum, num);
                maxNum = Math.max(maxNum, num);
            }
            return gcd(minNum, maxNum);
        }
    }
}
