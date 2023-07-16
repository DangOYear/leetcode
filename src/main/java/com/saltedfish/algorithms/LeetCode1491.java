package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/17
 */
public class LeetCode1491 {
    class Solution {
        public double average(int[] salary) {
            double maxSalary = Integer.MIN_VALUE;
            double minSalary = Integer.MAX_VALUE;
            double sum = 0.0;
            for (int x : salary) {
                if (maxSalary < x) {
                    maxSalary = x;
                }

                if (minSalary > x) {
                    minSalary = x;
                }
                sum += x;
            }
            return (sum - maxSalary - minSalary) / (salary.length - 2);
        }
    }
}
