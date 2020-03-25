package src.algorithms;

public class LeetCode0413 {
    class Solution {
        public int numberOfArithmeticSlices(int[] A) {
            int res = 0;
            int[] dp = new int[A.length];
            for (int i = 2; i < dp.length; ++i) {
                if (A[i] - A[i-1] == A[i-1] - A[i-2]) {
                    dp[i] = 1 + dp[i-1];
                    res += dp[i];
                }
            }
            return res;
        }
    }
}
