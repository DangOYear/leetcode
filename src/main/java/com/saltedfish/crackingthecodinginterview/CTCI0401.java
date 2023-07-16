package com.saltedfish.crackingthecodinginterview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author SaltedFish
 * @date 2021/6/3
 */
public class CTCI0401 {
    class Solution {
        public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
            boolean[] visited = new boolean[n];
            ArrayList<ArrayList<Integer>> edgeList = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                edgeList.add(new ArrayList<>());
            }

            for (int[] edge : graph) {
                edgeList.get(edge[0]).add(edge[1]);
            }

            Queue<Integer> queue = new LinkedList<>();
            queue.offer(start);
            while (!queue.isEmpty()) {
                int vertex = queue.poll();
                for (int i = 0; i < edgeList.get(vertex).size(); i++) {
                    int neighbor = edgeList.get(vertex).get(i);
                    if (visited[neighbor]) {
                        continue;
                    }

                    if (neighbor == target) {
                        return true;
                    }

                    visited[neighbor] = true;

                    queue.offer(neighbor);
                }
            }
            return false;
        }
    }
}
