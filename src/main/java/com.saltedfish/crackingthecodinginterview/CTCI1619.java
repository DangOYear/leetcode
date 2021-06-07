package com.saltedfish.crackingthecodinginterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author SaltedFish
 * @date 2021/6/7
 */
public class CTCI1619 {
    class Solution {

        private int direction = 8;
        private int row;
        private int col;
        private boolean[][] visited;
        private int[][] land;

        private int dfs(int[][] land, int x, int y) {
            if (x < 0 || x >= row || y < 0 || y >= col || visited[x][y] || land[x][y] != 0) {
                return 0;
            }
            int res = 1;
            visited[x][y] = true;
            int[] dx = new int[]{-1, -1, -1, 0, 0, 1, 1, 1};
            int[] dy = new int[]{-1, 0, 1, -1, 1, -1, 0, 1};

            for (int i = 0; i < direction; i++) {
                int m = x + dx[i];
                int n = y + dy[i];
                res += dfs(land, m , n);
            }
            return res;
        }

        public int[] pondSizes(int[][] land) {
            this.row = land.length;
            this.col = land[0].length;
            this.land = land;
            this.visited = new boolean[row][col];

            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (!visited[i][j] && land[i][j] == 0) {
                        int area = dfs(land, i, j);
                        res.add(area);
                    }
                }
            }
            Collections.sort(res);
            int[] ans = new int[res.size()];
            for (int i = 0; i < ans.length; i++) {
                ans[i] = res.get(i);
            }
            return ans;
        }
    }
}
