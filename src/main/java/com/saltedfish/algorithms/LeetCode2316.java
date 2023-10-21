package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode2316 {
    class Solution {


        boolean visited[];
        List<List<Integer>> graph;

        int dfs(int pos) {
            if (visited[pos]) {
                return 0;
            }

            int count = 1;

            for (int p : graph.get(pos)) {
                count += dfs(p);
            }

            return count;
        }

        public long countPairs(int n, int[][] edges) {
            visited = new boolean[n];
            graph = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }
            for (int i = 0; i < edges.length; i++) {
                graph.get(edges[i][0]).add(edges[i][1]);
                graph.get(edges[i][1]).add(edges[i][0]);
            }
            long res = 0;
            long temp = 0;
            for (int i = 0; i < n; i++) {
                int num = dfs(i);
                res += num * temp;
                temp += num;
            }
            return res;
        }
    }
}
