package com.saltedfish.crackingthecodinginterview;

import java.util.PriorityQueue;

public class CTCI1714 {
    class Solution {
        public int[] smallestK(int[] arr, int k) {
            int[] res = new int[k];
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

            for (int x:arr) {
                priorityQueue.add(x);
            }

            for (int i = 0; i < res.length; ++i) {
                res[i] = priorityQueue.poll();
            }
            return res;
        }
    }
}
