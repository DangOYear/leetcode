package com.saltedfish.algorithms;

public class LeetCode6148 {
    class Solution {

        public int GetMax(int a, int b, int c, int d, int e, int f, int g, int h, int i) {
            int res = 0;
            res = Math.max(res, a);
            res = Math.max(res, b);
            res = Math.max(res, c);
            res = Math.max(res, d);
            res = Math.max(res, e);
            res = Math.max(res, f);
            res = Math.max(res, g);
            res = Math.max(res, h);
            res = Math.max(res, i);
            return res;
        }

        public int[][] largestLocal(int[][] grid) {
            int n = grid.length;
            int[][] res = new int[n-2][n-2];

            int posi = 0;
            int posj = 0;
            for (int i = 1; i < n - 1; i++) {
                for (int j = 1; j < n - 1; j++) {
                    res[posi][posj] = GetMax(grid[i-1][j-1], grid[i-1][j], grid[i-1][j+1], grid[i][j-1], grid[i][j],
                            grid[i][j+1], grid[i+1][j-1], grid[i+1][j], grid[i+1][j+1]);
                    ++posj;
                }
                posj = 0;
                ++posi;
            }

            return res;
        }
    }
}
