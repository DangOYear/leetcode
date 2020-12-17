package com.saltedfish.algorithms;

public class LeetCode0807 {

    class Solution {
        public int maxIncreaseKeepingSkyline(int[][] grid) {
            int res = 0;
            int[] fromLeft = new int[grid.length];
            int[] fromTop = new int[grid[0].length];
            for (int i = 0; i < grid.length; ++i) {
                int max = grid[i][0];
                for (int j = 0; j < grid[0].length; ++j) {
                    max = Math.max(max, grid[i][j]);
                }
                fromLeft[i] = max;
            }


            for (int i = 0; i < grid[0].length; ++i) {
                int max = grid[0][i];
                for (int j = 0; j < grid.length; ++j) {
                    max = Math.max(max, grid[j][i]);
                }
                fromTop[i] = max;
            }

            for (int i = 0; i < grid.length; ++i) {
                for (int j = 0; j < grid.length; ++j) {
                    res += Math.min(fromLeft[i], fromTop[j]) - grid[i][j];
                }
            }
            return res;
        }
    }


}
