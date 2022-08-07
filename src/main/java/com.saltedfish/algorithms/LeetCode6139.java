package com.saltedfish.algorithms;

import java.util.*;

public class LeetCode6139 {
    class Solution {
        int n;
        List<List<Integer>> edges;
        boolean[] visited;

        boolean[] isRestricted;

        void dfs(int start) {
            if (isRestricted[start]) {
                return;
            }
            if (visited[start]) {
                return;
            }
            visited[start] = true;
            for (int i = 0; i < edges.get(start).size(); i++) {
                dfs(edges.get(start).get(i));
            }
        }

        public int reachableNodes(int n, int[][] edges, int[] restricted) {
            this.n = n;
            this.edges = new ArrayList();
            for (int i = 0; i < n; i++) {
                this.edges.add(new ArrayList<>());
            }
            for (int i = 0; i < edges.length; i++) {
                this.edges.get(edges[i][0]).add(edges[i][1]);
                this.edges.get(edges[i][1]).add(edges[i][0]);
            }
            this.visited = new boolean[n];
            this.isRestricted = new boolean[n];

            for (int x : restricted) {
                isRestricted[x] = true;
            }
            dfs(0);
            int count = 0;
            for (int i = 0; i < visited.length; i++) {
                if (visited[i]) {
                    ++count;
                }
            }
            return count;
        }
    }
}
