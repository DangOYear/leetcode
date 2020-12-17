package com.saltedfish.algorithms;

public class LeetCode1672 {
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int res = 0;
            for (int i = 0; i < accounts.length; ++i) {
                int account = 0;
                for (int j = 0; j < accounts[i].length; ++j) {
                    account += accounts[i][j];
                }
                res = Math.max(account, res);
            }
            return res;
        }
    }
}
