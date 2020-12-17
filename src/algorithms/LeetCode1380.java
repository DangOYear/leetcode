package src.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1380 {
    class Solution {
        public List<Integer> luckyNumbers (int[][] matrix) {
            int row = matrix.length;
            int col = matrix[0].length;
            int[] rowMin = new int[row];
            Arrays.fill(rowMin, Integer.MAX_VALUE);
            int[] colMax = new int[col];
            for (int i = 0; i < row; ++i) {
                for (int j = 0; j < col; ++j) {
                    rowMin[i] = Math.min(rowMin[i], matrix[i][j]);
                    colMax[j] = Math.max(colMax[j], matrix[i][j]);
                }
            }
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < row; ++i) {
                for (int j = 0; j < col; ++j) {
                    if (matrix[i][j] == colMax[j] && matrix[i][j] == rowMin[i]) {
                        res.add(matrix[i][j]);
                    }
                }
            }
            return res;
        }
    }

}
