package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/5/9
 */
public class LeetCode5750 {
    class Solution {
        public int maximumPopulation(int[][] logs) {
            int[] count = new int[110];
            for (int i = 0; i < logs.length; i++) {
                int start = logs[i][0];
                int end = logs[i][1];
                for (int j = start; j < end; j++) {
                    count[j-1950]++;
                }
            }
            int res = 0;
            for (int i = 0; i < count.length; i++) {
                if (count[i] > count[res]) {
                    res = i;
                }
            }
            return res + 1950;
        }
    }
}
