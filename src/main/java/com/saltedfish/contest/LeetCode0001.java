package com.saltedfish.contest;

import java.util.Arrays;

public class LeetCode0001 {
    class Solution {
        public int deleteGreatestValue(int[][] grid) {
            int row = grid.length;
            int col = grid[0].length;
            for (int i = 0; i < row; i++) {
                Arrays.sort(grid[i]);
            }
            int res = 0;
            for (int i = col - 1; i >= 0; i--) {
                int maxNum = 0;
                for (int j = 0; j < row; j++) {
                    maxNum = Math.max(maxNum, grid[j][i]);
                }
                res += maxNum;
            }
            return res;
        }
    }
}
