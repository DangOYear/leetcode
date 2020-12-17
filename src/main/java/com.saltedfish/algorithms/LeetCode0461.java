package com.saltedfish.algorithms;



public class LeetCode0461 {
    class Solution {
        public int hammingDistance(int x, int y) {
            String sx = Integer.toBinaryString(x);
            String sy = Integer.toBinaryString(y);
            int res = 0;
            for (int i = sx.length() - 1, j = sy.length() - 1; i >= 0 || j >= 0; i--,j--) {
                char cx, cy;
                if (i < 0) {
                    cx = '0';
                }else {
                    cx = sx.charAt(i);
                }

                if (j < 0) {
                    cy = '0';
                }else {
                    cy = sy.charAt(j);
                }
                if (cx != cy)
                    ++res;
            }
            return res;
        }
    }
}
