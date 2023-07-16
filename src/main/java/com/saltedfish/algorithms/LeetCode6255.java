package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode6255 {
    class Solution {
        List<List<Integer>> edge;
        boolean []visited;

        void dfs(int pos) {
            if (visited[pos]) {
                return;
            }
            visited[pos] = true;
            for (int x : edge.get(pos)) {
                dfs(x);
            }
        }

        public int minScore(int n, int[][] roads) {
            edge = new ArrayList<>();
            visited = new boolean[n];
            for (int i = 0; i < n; i++) {
                edge.add(new ArrayList<>());
            }

            for (int i = 0; i < roads.length; i++) {
                edge.get(roads[i][0]-1).add(roads[i][1]-1);
                edge.get(roads[i][1]-1).add(roads[i][0]-1);
            }

            dfs(0);
            int res = Integer.MAX_VALUE;
            for (int i = 0; i < roads.length; i++) {
                if (visited[roads[i][0]-1]) {
                    res = Math.min(res, roads[i][2]);
                }
            }
            return res;
        }
    }

}
