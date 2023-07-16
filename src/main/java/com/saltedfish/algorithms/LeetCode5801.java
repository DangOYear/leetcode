package com.saltedfish.algorithms;

import java.util.Arrays;

/**
 * @author SaltedFish
 * @date 2021/7/4
 */
public class LeetCode5801 {
    class Solution {
        public int eliminateMaximum(int[] dist, int[] speed) {
            int n = dist.length;
            int[] time = new int[n];
            for (int i = 0; i < n; i++) {
                time[i] = (dist[i] - 1) / speed[i];
            }
            Arrays.sort(time);
            for (int i = 0; i < n; i++) {
                if (time[i] < i) {
                    return i;
                }
            }
            return n;
        }
    }

    public static void main(String[] args) {
        LeetCode5801.Solution solution = new LeetCode5801().new Solution();
        int[] dist = new int[]{1,3,4};
        int[] speed = new int[]{1, 1, 1};
        System.out.println(solution.eliminateMaximum(dist, speed));


    }
}
