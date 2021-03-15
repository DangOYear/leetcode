package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/15
 */
public class LeetCode0054 {
    class Solution {

        private void travel(List<Integer> res, int left, int right, int top, int bottom, int[][] matrix) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }

            for (int j = top + 1; j <= bottom; ++j) {
                res.add(matrix[j][right]);
            }


            for (int i = right - 1; bottom != top && i >= left; --i) {
                res.add(matrix[bottom][i]);
            }

            for (int j = bottom - 1; left != right && j >= top + 1; --j) {
                res.add(matrix[j][left]);
            }

        }


        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> res = new ArrayList<>();
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return res;
            }
            int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;

            while (left <= right && top <= bottom) {
                travel(res, left, right, top, bottom, matrix);
                left++;
                right--;
                top++;
                bottom--;
            }
            return res;
        }
    }

}
