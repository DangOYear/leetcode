package src.algorithms;

import java.util.*;




public class LeetCode0300 {
class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0)
            return 0;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxLen = 1;
        
        for (int i = 1; i < dp.length; ++i) {
            int maxLoop = 0;
            
            for (int j = 0; j < i; ++j) {
                if (nums[i] > nums[j]) {
                    maxLoop = Math.max(maxLoop, dp[j]);
                }
                
                dp[i] = maxLoop + 1;
                maxLen = Math.max(maxLen, dp[i]);
                
            }
            
        }
        return maxLen;
    }
}

}
