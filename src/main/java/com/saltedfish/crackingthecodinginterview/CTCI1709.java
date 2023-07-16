package com.saltedfish.crackingthecodinginterview;

public class CTCI1709 {
    class Solution {
        public int getKthMagicNumber(int k) {
            int mul3 = 0;
            int mul5 = 0;
            int mul7 = 0;
            int[] dp = new int[k];
            dp[0] = 1;
            for (int i = 1; i < k; ++i) {
                dp[i] = Math.min(dp[mul3] * 3, Math.min(dp[mul5] * 5, dp[mul7] * 7));
                if (dp[i] == dp[mul3] * 3)  mul3++;
                if (dp[i] == dp[mul5] * 5)  mul5++;
                if (dp[i] == dp[mul7] * 7)  mul7++;
            }
            return dp[k-1];
        }
    }
}
