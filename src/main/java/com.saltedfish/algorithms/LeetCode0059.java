package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/16
 */
public class LeetCode0059 {
    class Solution {

        private int travel(int pos, int left, int right, int top, int bottom, int[][] matrix) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = pos;
                ++pos;
            }

            for (int j = top + 1; j <= bottom; ++j) {
                matrix[j][right] = pos;
                ++pos;
            }


            for (int i = right - 1; bottom != top && i >= left; --i) {
                matrix[bottom][i] = pos;
                ++pos;
            }

            for (int j = bottom - 1; left != right && j >= top + 1; --j) {
                matrix[j][left] = pos;
                ++pos;
            }
            return pos;
        }

        public int[][] generateMatrix(int n) {
            int[][] matrix = new int[n][n];
            int left = 0, right = n - 1, top = 0, bottom = n - 1;
            int pos = 1;
            while (left <= right && top <= bottom) {
                pos = travel(pos, left, right, top, bottom, matrix);
                ++left;
                --right;
                ++top;
                --bottom;
            }
            return matrix;
        }
    }
}
