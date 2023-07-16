package com.saltedfish.algorithms;

import java.util.*;

public class LeetCode6163 {
    class Solution {

        List<List<Integer>> edges1;
        int[] indeg1;

        List<List<Integer>> edges2;
        int[] indeg2;

        List<Integer> rowList;
        List<Integer> colList;

        public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
            int[][] res = new int[k][k];
            rowList = new ArrayList<>();
            colList = new ArrayList<>();

            edges1 = new ArrayList<>();
            for (int i = 0; i <= k; ++i) {
                edges1.add(new ArrayList<>());
            }
            indeg1 = new int[k+1];
            for (int[] row : rowConditions) {
                edges1.get(row[1]).add(row[0]);
                ++indeg1[row[0]];
            }

            Queue<Integer> queue1 = new LinkedList<>();
            for (int i = 1; i <= k; ++i) {
                if (indeg1[i] == 0) {
                    queue1.offer(i);
                }
            }

            int visited = 0;
            while (!queue1.isEmpty()) {
                ++visited;
                int u = queue1.poll();
                rowList.add(u);
                for (int v: edges1.get(u)) {
                    --indeg1[v];
                    if (indeg1[v] == 0) {
                        queue1.offer(v);
                    }
                }
            }
            if (visited != k) {
                return new int[][]{};
            }

            edges2 = new ArrayList<>();
            for (int i = 0; i <= k; ++i) {
                edges2.add(new ArrayList<>());
            }
            indeg2 = new int[k+1];
            for (int[] col : colConditions) {
                edges2.get(col[1]).add(col[0]);
                ++indeg2[col[0]];
            }

            Queue<Integer> queue2 = new LinkedList<>();
            for (int i = 1; i <= k; ++i) {
                if (indeg2[i] == 0) {
                    queue2.offer(i);
                }
            }

            visited = 0;
            while (!queue2.isEmpty()) {
                ++visited;
                int u = queue2.poll();
                colList.add(u);
                for (int v: edges2.get(u)) {
                    --indeg2[v];
                    if (indeg2[v] == 0) {
                        queue2.offer(v);
                    }
                }
            }
            if (visited != k) {
                return new int[][]{};
            }

            Collections.reverse(rowList);
            Collections.reverse(colList);

            int[] row = new int[k+1];
            for (int i = 0; i < k; i++) {
                row[rowList.get(i)] = i;
            }


            int[] col = new int[k+1];
            for (int i = 0; i < k; i++) {
                col[colList.get(i)] = i;
            }

            for (int i = 1; i <= k; i++) {
                res[row[i]][col[i]] = i;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        int k = 3;
        int[][] rowConditions = new int[][]{{1,2},{3,2}};
        int[][] colConditions = new int[][]{{2,1},{3,2}};
        LeetCode6163.Solution solution = new LeetCode6163().new Solution();
        System.out.println(solution.buildMatrix(k, rowConditions, colConditions));
    }
}
