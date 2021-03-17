package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/17
 */
public class LeetCode0997 {
    class Solution {
        public int findJudge(int N, int[][] trust) {
            int[] count = new int[N+1];
            int judge = -1;
            for (int[] t : trust) {
                count[t[1]]++;
                count[t[0]]--;
            }

            for (int i = 1; i < count.length; i++) {
                if (count[i] == N - 1) {
                    judge = i;
                }
            }
            return judge;
        }
    }
}
