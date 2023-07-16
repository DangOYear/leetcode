package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/5/21
 */
public class LeetCode1035 {
    class Solution {
        public int maxUncrossedLines(int[] nums1, int[] nums2) {
            int row = nums1.length;
            int col = nums2.length;

            int[][] dp = new int[row+1][col+1];

            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= col; j++) {
                    if (nums1[i-1] == nums2[j-1]) {
                        dp[i][j] = dp[i-1][j-1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                    }
                }
            }
            return dp[row][col];
        }
    }
}
