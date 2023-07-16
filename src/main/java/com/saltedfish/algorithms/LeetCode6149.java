package com.saltedfish.algorithms;

public class LeetCode6149 {
    class Solution {
        public int edgeScore(int[] edges) {
            int n = edges.length;
            long[] score = new long[n];
            for (int i = 0; i < n; i++) {
                score[edges[i]] += i;
            }
            long res = 0;
            int pos = 0;
            for (int i = 0; i < n; i++) {
                if (score[i] > res) {
                    res = score[i];
                    pos = i;
                }
            }
            return pos;
        }
    }
}
