package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/5/21
 */
public class LeetCode0861 {
    class Solution {
        public int matrixScore(int[][] grid) {
            int row = grid.length;
            int col = grid[0].length;
            int res = row * (1 << (col - 1));

            for (int j = 1; j < col; j++) {
                int numOfOne = 0;
                for (int i = 0; i < row; i++) {
                    if (grid[i][0] == 1) {
                        numOfOne += grid[i][j];
                    } else {
                        numOfOne += (1 - grid[i][j]);
                    }
                }
                int diff = Math.max(numOfOne, row - numOfOne) * (1 << (col - j - 1));
                res += diff;
            }
            return res;
        }
    }
}
