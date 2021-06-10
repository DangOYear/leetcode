package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/1/23
 */
public class LeetCode1319 {
    class UnionFind {
        private int count;
        private int[] parent;

        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
            count = n;
        }

        public int getCount() {
            return count;
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

            parent[fx] = fy;
            --count;
        }

    }

    class Solution {
        public int makeConnected(int n, int[][] connections) {

            if (connections.length < n - 1) {
                return -1;
            }

            UnionFind unionFind = new UnionFind(n);

            for (int i = 0; i < connections.length; i++) {
                unionFind.unit(connections[i][0], connections[i][1]);
            }

            return unionFind.getCount() - 1;
        }
    }
}
