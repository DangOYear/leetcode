package com.saltedfish.crackingthecodinginterview;

/**
 * @author SaltedFish
 * @date 2021/6/7
 */
public class CTCI0811 {
    class Solution {

        public int waysToChange(int n) {
            int MOD = 1000000007;
            int[] coins = new int[]{25, 10, 5, 1};

            int[] dp = new int[n+1];
            dp[0] = 1;
            for (int i = 0; i < 4; i++) {
                int coin = coins[i];
                for (int c = coin; c <= n; c++) {
                    dp[c] = (dp[c] + dp[c - coin]) % MOD;
                }
            }
            return dp[n];
        }
    }
}
