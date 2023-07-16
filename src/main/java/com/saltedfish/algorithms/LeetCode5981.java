package com.saltedfish.algorithms;

public class LeetCode5981 {
    class Solution {
        public int[] missingRolls(int[] rolls, int mean, int n) {
            int sum = 0;
            for (int num : rolls) {
                sum += num;
            }
            int remainSum = mean * (n + rolls.length) - sum;
            int remainMean = remainSum / n;
            if (remainMean <= 0 || remainMean > 6 || remainSum >= 6 * n + 1) {
                return new int[]{};
            }

            int tempRemainSum = remainSum - remainMean * n;
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                if (tempRemainSum > 0) {
                    tempRemainSum--;
                    res[i]++;
                }
                res[i] += remainMean;
            }
            return res;
        }
    }
}
