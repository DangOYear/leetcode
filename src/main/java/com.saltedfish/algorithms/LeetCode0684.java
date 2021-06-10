package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/6/10
 */
public class LeetCode0684 {
    class UnionFind {
        private int[] parent;

        public UnionFind(int n) {
            parent = new int[n+1];
            for (int i = 1; i <= n; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            int fx = x;
            while (fx != parent[fx]) {
                fx = parent[fx];
            }
            parent[x] = fx;
            return fx;
        }

        public void unit(int x, int y) {
            int fx = find(x);
            int fy = find(y);

            if (fx == fy) {
                return;
            }

            parent[fy] = fx;
        }
    }

    class Solution {
        public int[] findRedundantConnection(int[][] edges) {
            int vertexNum = edges.length;
            UnionFind unionFind = new UnionFind(vertexNum);
            for (int[] edge : edges) {
                int vertex1 = edge[0];
                int vertex2 = edge[1];

                if (unionFind.find(vertex1) != unionFind.find(vertex2)) {
                    unionFind.unit(vertex1, vertex2);
                } else {
                    return edge;
                }
            }

            return new int[]{};
        }
    }
}
