package com.saltedfish.codinginterviews;

import java.util.PriorityQueue;

public class CI0040 {
    class Solution {
        public int[] getLeastNumbers(int[] arr, int k) {
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
            int[] res = new int[k];
            for (int x:arr) {
                priorityQueue.offer(x);
            }
            for (int i = 0; i < res.length; ++i) {
                res[i] = priorityQueue.poll();
            }
            return res;
        }
    }

    public static void main(String[] args) {
        CI0040.Solution solution = new CI0040().new Solution();
        int[] arr = new int[]{0, 1, 2, 1};

        int[] res = solution.getLeastNumbers(arr, 1);
        for (int x:res) {
            System.out.print(x);
        }
    }
}
