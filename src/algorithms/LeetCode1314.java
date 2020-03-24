package src.algorithms;

public class LeetCode1314 {
    class Solution {

        private int[][] dp;
        private int row;
        private int col;

        int getPrefixSum(int x, int y) {
            x = Math.max(Math.min(x, row), 0);
            y = Math.max(Math.min(y, col), 0);

            return dp[x][y];
        }

        public int[][] matrixBlockSum(int[][] mat, int K) {
            row = mat.length;
            col = mat[0].length;
            dp = new int[row+1][col+1];
            for (int i = 1; i <= row; ++i) {
                for (int j = 1; j <= col; ++j) {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + mat[i-1][j-1];
                }
            }
            int[][] res = new int[row][col];

            for (int i = 0; i < row; ++i) {
                for (int j = 0; j < col; ++j) {
                    res[i][j] = getPrefixSum(i+K+1, j+K+1) - getPrefixSum(i-K, j+K+1) - getPrefixSum(i+K+1, j-K) + getPrefixSum(i-K, j-K);
                }
            }
            return res;
        }
    }
}
