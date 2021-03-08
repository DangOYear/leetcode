package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author SaltedFish
 * @date 2021/3/8
 */
public class LeetCode0207 {
    class Solution {

        List<List<Integer>> edges;

        int[] inDegree;

        public boolean canFinish(int numCourses, int[][] prerequisites) {
            edges = new ArrayList<>();

            for (int i = 0; i < numCourses; i++) {
                edges.add(new ArrayList<>());
            }

            inDegree = new int[numCourses];
            for (int[] edge : prerequisites) {
                edges.get(edge[1]).add(edge[0]);
                ++inDegree[edge[0]];
            }

            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < numCourses; i++) {
                if (inDegree[i] == 0) {
                    queue.offer(i);
                }
            }

            int visited = 0;

            while (!queue.isEmpty()) {
                ++visited;
                int u = queue.poll();
                for (int vertex : edges.get(u)) {
                    --inDegree[vertex];
                    if (inDegree[vertex] == 0) {
                        queue.offer(vertex);
                    }
                }
            }

            return visited == numCourses;
        }
    }
}
