package com.saltedfish.algorithms;

public class LeetCode1155 {

    class Solution {
        public int numRollsToTarget(int n, int k, int target) {
            int mod = 1000000007;
            int[][] f = new int[n+1][target+1];
            f[0][0] = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= target; j++) {
                    for (int m = 1; m <= k; m++) {
                        if (j - m >= 0) {
                            f[i][j] = (f[i][j] + f[i - 1][j - m]) % mod;
                        }
                    }
                }
            }
            return f[n][target];
        }
    }


    public static void main(String[] args) {
        LeetCode1155.Solution solution = new LeetCode1155().new Solution();
        System.out.println(solution.numRollsToTarget(1, 6, 3) == 1);
        System.out.println(solution.numRollsToTarget(2, 6, 7) == 6);
        System.out.println(solution.numRollsToTarget(30, 30, 500) == 222616187);
    }

}
