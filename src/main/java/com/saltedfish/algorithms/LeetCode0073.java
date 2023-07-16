package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/21
 */
public class LeetCode0073 {
    class Solution {
        public void setZeroes(int[][] matrix) {
            int row = matrix.length;
            int col = matrix[0].length;
            int[] rowFlag = new int[row];
            int[] colFlag = new int[col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (matrix[i][j] == 0) {
                        rowFlag[i] = 1;
                        colFlag[j] = 1;
                    }
                }
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (rowFlag[i] == 1 || colFlag[j] == 1) {
                        matrix[i][j] = 0;
                    }
                }
            }

        }
    }


}
