package com.saltedfish.algorithms;

public class LeetCode2428 {
    class Solution {
        public int maxSum(int[][] grid) {
            int res = 0;
            int row = grid.length;
            int col = grid[0].length;
            for (int i = 1; i < row - 1; i++) {
                for (int j = 1; j < col - 1; j++) {
                    int sum = grid[i][j] + grid[i-1][j-1] + grid[i-1][j] + grid[i-1][j+1] + grid[i+1][j-1] + grid[i+1][j] + grid[i+1][j+1];
                    res = Math.max(res, sum);
                }
            }

            return res;
        }
    }
}
