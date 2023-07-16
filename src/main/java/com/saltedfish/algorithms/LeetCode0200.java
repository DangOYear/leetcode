package com.saltedfish.algorithms;

public class LeetCode0200 {
    class Solution {

        void dfs(char[][] grid, int x, int y) {
            int row = grid.length;
            int col = grid[0].length;

            if (x < 0 || x >= row || y < 0 || y >= col || grid[x][y] == '0') {
                return;
            }
            grid[x][y] = '0';
            int directX[] = new int[]{1, -1, 0, 0};
            int directY[] = new int[]{0, 0, -1, 1};

            for (int i = 0; i < 4; ++i) {
                int dx = x + directX[i];
                int dy = y + directY[i];
                dfs(grid, dx, dy);
            }
        }

        public int numIslands(char[][] grid) {
            if (grid == null || grid.length == 0) {
                return 0;
            }
            int numIsland = 0;
            int row = grid.length;
            int col = grid[0].length;
            for (int i = 0; i < row; ++i) {
                for (int j = 0; j < col; ++j) {
                    if (grid[i][j] == '1') {
                        ++numIsland;
                        dfs(grid, i, j);
                    }
                }
            }
            return numIsland;
        }
    }
}
