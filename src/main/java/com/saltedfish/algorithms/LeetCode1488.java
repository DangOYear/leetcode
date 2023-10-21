package com.saltedfish.algorithms;

import java.util.*;

public class LeetCode1488 {
    class Solution {
        public int[] avoidFlood(int[] rains) {
            Map<Integer, Integer> m = new HashMap<>();

            // not rain index
            Queue<Integer> q = new PriorityQueue<>();


            int len = rains.length;
            int[] res = new int[len];
            for (int i = 0; i < len; i++) {
                int num = rains[i];

                if (num == 0) {
                    q.add(i);
                    continue;
                }

                if (m.getOrDefault(num, 0) == 0) {
                    res[i] = -1;
                    m.put(num, m.getOrDefault(num,0) + 1);
                    continue;
                }

                if (m.getOrDefault(num, 0) == 1) {
                    if (q.size() == 0) {
                        return new int[]{};
                    }

                    int idx = q.poll();
                    res[idx] = num;
                    res[i] = -1;
                }


            }

            while (!q.isEmpty()) {
                res[q.poll()] = 1;
            }

            return res;

        }
    }

    public static void main(String[] args) {
        LeetCode1488.Solution solution = new LeetCode1488().new Solution();
        int[] rains = new int[]{1,2,0,0,2,1};
        System.out.println(solution.avoidFlood(rains));
    }
}
