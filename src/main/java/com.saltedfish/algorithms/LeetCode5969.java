package com.saltedfish.algorithms;

import java.util.PriorityQueue;

/**
 * @author SaltedFish
 * @date 2022/1/2
 */
public class LeetCode5969 {
    class Solution {
        public boolean asteroidsDestroyed(int mass, int[] asteroids) {
            long cnt = mass;
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int x : asteroids) {
                pq.offer(x);
            }

            while (pq.size() > 0 && cnt >= pq.peek()) {
                int num = pq.poll();
                cnt += num;
            }
            return pq.size() == 0;
        }
    }
}
