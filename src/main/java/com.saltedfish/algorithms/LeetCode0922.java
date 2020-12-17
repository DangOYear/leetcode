package com.saltedfish.algorithms;

public class LeetCode0922 {
    class Solution {
        public int[] sortArrayByParityII(int[] A) {
            int N = A.length;
            int[] res = new int[N];

            int pos = 0;
            for (int x : A) {
                if (x % 2 == 0) {
                    res[pos] = x;
                    pos += 2;
                }
            }

            pos = 1;
            for (int x : A) {
                if (x % 2 == 1) {
                    res[pos] = x;
                    pos += 2;
                }
            }
            return res;
        }
    }
}
