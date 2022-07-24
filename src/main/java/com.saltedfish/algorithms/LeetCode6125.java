package com.saltedfish.algorithms;

import java.util.*;

public class LeetCode6125 {
    class Solution {
        public int equalPairs(int[][] grid) {
            int res = 0;
            int row = grid.length;
            int col = grid[0].length;
            Map<String, Integer> colMap = new HashMap();
            List<String> rowList = new ArrayList<>();
            for (int i = 0; i < row; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < col; j++) {
                    sb.append(grid[i][j]);
                    sb.append(",");
                }
                colMap.put(sb.toString(), colMap.getOrDefault(sb.toString(), 0) +1);
            }

            for (int i = 0; i < col; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < row; j++) {
                    sb.append(grid[j][i]);
                    sb.append(",");
                }
                rowList.add(sb.toString());
            }
            for (String s : rowList) {
                res += colMap.getOrDefault(s, 0);
            }
            return res;
        }
    }

    public static void main(String[] args) {
        LeetCode6125.Solution solution = new LeetCode6125().new Solution();
        int[][] grid = new int[][]{{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        System.out.println(solution.equalPairs(grid));
    }
}
