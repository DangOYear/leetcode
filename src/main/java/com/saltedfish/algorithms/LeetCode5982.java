package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2022/1/16
 */
public class LeetCode5982 {
    class Solution {

        public long mostPoints(int[][] questions) {
            int n = questions.length;
            long[] res = new long[n+1];
            long maxValue = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int pos = i + questions[i][1] + 1;
                if (pos >= n) {
                    pos = n;
                }
                maxValue = Math.max(maxValue, res[i]);

                res[pos] = Math.max(res[pos], maxValue + questions[i][0]);
            }
            return res[n];
        }
    }

    public static void main(String[] args) {

    }
}
