package src.algorithms;

public class LeetCode0463 {
    class Solution {
        public int islandPerimeter(int[][] grid) {
            int row = grid.length;
            int col = grid[0].length;
            int res = 0;
            int[] directX = {-1, 1, 0, 0};
            int[] directY = {0, 0, -1, 1};
            for (int i = 0; i < row; ++i) {
                for (int j = 0; j < col; ++j) {
                    if (grid[i][j] == 1) {
                        int count = 0;
                        for (int k = 0; k < 4; ++k) {
                            int dx = directX[k] + i;
                            int dy = directY[k] + j;
                            if (dx < 0 || dx >= row || dy < 0 || dy >= col || grid[dx][dy] == 0) {
                                count++;
                            }
                        }
                        res += count;
                    }
                }
            }
            return res;
        }
    }
}
