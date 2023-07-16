package com.saltedfish.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author SaltedFish
 * @date 2021/3/14
 */
public class LeetCode5702 {
    class Solution {
        public int findCenter(int[][] edges) {
            Map<Integer, Integer> degree = new HashMap<>();
            Set<Integer> num = new HashSet<>();

            int res = 0;

            for (int[] edge : edges) {
                num.add(edge[0]);
                num.add(edge[1]);
                degree.put(edge[0], degree.getOrDefault(edge[0], 0) + 1);
                degree.put(edge[1], degree.getOrDefault(edge[1], 0) + 1);
            }

            for (Map.Entry<Integer, Integer> entry : degree.entrySet()) {
                if (entry.getValue() == num.size() - 1) {
                    res = entry.getKey();
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        LeetCode5702.Solution solution = new LeetCode5702().new Solution();
        int[][] edges = new int[][]{{1,2},{2,3},{4,2}};
        System.out.println(solution.findCenter(edges));
    }
}
