package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/9
 */
public class LeetCode0152 {
    class Solution {
        public int maxProduct(int[] nums) {
            int maxP = nums[0];
            int minP = nums[0];
            int res = nums[0];
            for (int i = 1; i < nums.length; i++) {
                int tempMax = maxP;
                int tempMin = minP;
                maxP = Math.max(tempMax * nums[i], Math.max(nums[i], tempMin * nums[i]));
                minP = Math.min(tempMin * nums[i], Math.min(nums[i], tempMax * nums[i]));
                res = Math.max(res, maxP);
            }
            return res;
        }
    }
}
