package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/8/1
 */
public class LeetCode5831 {
    class Solution {
        public long numberOfWeeks(int[] milestones) {
            long sum = 0;
            long max = 0;
            for (int x : milestones) {
                max = Math.max(max,x);
                sum += x;
            }
            sum -= max;
            if (max > sum + 1) {
                return sum * 2 + 1;
            } else {
                return max + sum;
            }
        }
    }
}
