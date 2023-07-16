package com.saltedfish.codinginterviews;

import java.util.ArrayList;
import java.util.List;

public class CI0029 {
    class Solution {
        public int[] spiralOrder(int[][] matrix) {
            if (matrix.length == 0) {
                return new int[]{};
            }
            int r1 = 0, r2 = matrix.length - 1;
            int c1 = 0, c2 = matrix[0].length - 1;
            int[] res = new int[matrix.length * matrix[0].length];
            int count = 0;
            while (r1 <= r2 && c1 <= c2) {
                for (int c = c1; c <= c2; ++c) {
                    res[count++] = matrix[r1][c];
                }

                for (int r = r1 + 1; r <= r2; ++r) {
                    res[count++] = matrix[r][c2];
                }

                if (r1 < r2 && c1 < c2) {
                    for (int c = c2 - 1; c > c1; --c) {
                        res[count++] = matrix[r2][c];
                    }
                    for (int r = r2; r > r1; --r) {
                        res[count++] = matrix[r][c1];
                    }
                }
                ++r1;
                --r2;
                ++c1;
                --c2;
            }
            return res;
        }
    }
}
