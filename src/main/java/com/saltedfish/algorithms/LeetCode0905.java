package com.saltedfish.algorithms;

public class LeetCode0905 {
    class Solution {
        public int[] sortArrayByParity(int[] A) {
            int[] res = new int[A.length];
            int pos = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] % 2 == 0) {
                    res[pos++] = A[i];
                }
            }

            for (int i = 0; i < A.length; i++) {
                if (A[i] % 2 == 1) {
                    res[pos++] = A[i];
                }
            }

            return res;
        }
    }
}
