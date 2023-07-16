package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/10
 */
public class LeetCode0048 {
    class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;

            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[n - 1 - i][j];
                    matrix[n - 1 - i][j] = temp;
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
    }
}