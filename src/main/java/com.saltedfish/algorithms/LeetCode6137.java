package com.saltedfish.algorithms;

public class LeetCode6137 {
    class Solution {

        int[] nums;
        boolean[] dp;
        int n;
        boolean judgeTwoSame(int i , int j) {
            if (i >= nums.length || j >= nums.length) {
                return false;
            }
            return nums[i] == nums[j];
        }

        boolean judgeThreeSame(int i , int j, int k) {
            if (i >= nums.length || j >= nums.length || k >= nums.length) {
                return false;
            }
            return nums[i] == nums[j] && nums[j] == nums[k];
        }

        boolean judgeThreeAsecnd(int i , int j, int k) {
            if (i >= nums.length || j >= nums.length || k >= nums.length) {
                return false;
            }
            return nums[i] == nums[j] - 1 && nums[j] == nums[k] - 1;
        }

        public boolean validPartition(int[] nums) {
            this.nums = nums;
            this.n = nums.length;
            this.dp = new boolean[n+1];
            dp[0] = true;

            for (int i = 2; i <= n; i++) {
                if (i <= 2) {
                    dp[i] = dp[i-2] && judgeTwoSame(i - 2, i - 1);
                }
                if (i > 2) {
                    dp[i] = (dp[i-2] && judgeTwoSame(i - 2, i - 1))
                            || (dp[i-3] && judgeThreeSame(i -3, i - 2, i - 1))
                            || (dp[i-3] && judgeThreeAsecnd(i -3, i - 2, i - 1));
                }

            }

            return dp[n];
        }
    }
}
