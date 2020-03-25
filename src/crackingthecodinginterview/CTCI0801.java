package src.crackingthecodinginterview;

public class CTCI0801 {
    class Solution {
        public int waysToStep(int n) {
            if (n < 3)
                return n;
            long[] dp = new long[n];
            dp[0] = 1;
            dp[1] = 2;
            dp[2] = 4;
            for (int i = 3; i < n; ++i) {
                dp[i] = (dp[i-1] + dp[i-2] + dp[i-3]) % 1000000007;
            }
            return (int)dp[n-1];
        }
    }
}
