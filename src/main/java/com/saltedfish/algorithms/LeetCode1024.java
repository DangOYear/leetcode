package com.saltedfish.algorithms;

public class LeetCode1024 {
    class Solution {
        public int videoStitching(int[][] clips, int T) {
            int[] maxRight = new int[T];
            int last = 0;
            int pre = 0;
            int res = 0;
            for (int[] clip : clips) {
                if (clip[0] < T) {
                    maxRight[clip[0]] = Math.max(maxRight[clip[0]], clip[1]);
                }
            }
            for (int i = 0; i < T; ++i) {
                last = Math.max(last, maxRight[i]);
                if (i == last) {
                    return -1;
                }
                if (i == pre) {
                    ++res;
                    pre = last;
                }
            }
            return res;
        }
    }
}
