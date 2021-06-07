package com.saltedfish.crackingthecodinginterview;

/**
 * @author SaltedFish
 * @date 2021/6/7
 */
public class CTCI0810 {
    class Solution {

        private int row;
        private int col;
        private int newColor;
        private int oldColor;
        private boolean[][] visited;
        private int direction = 4;

        private void dfs(int[][] image, int x, int y) {
            if (x < 0 || x >= row || y < 0 || y >= col || image[x][y] != oldColor) {
                return;
            }
            visited[x][y] = false;
            image[x][y] = newColor;
            int[] directX = new int[]{-1, 1, 0, 0};
            int[] directY = new int[]{0, 0, -1, 1};
            for (int i = 0; i < direction; i++) {
                int m = x + directX[i];
                int n = y + directY[i];
                dfs(image, m, n);
            }
        }

        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

            this.row = image.length;
            this.col = image[0].length;
            this.newColor = newColor;
            this.oldColor = image[sr][sc];
            this.visited = new boolean[row][col];

            if (this.newColor == this.oldColor) {
                return image;
            } else {
                dfs(image, sr, sc);
            }
            return image;
        }
    }
}
