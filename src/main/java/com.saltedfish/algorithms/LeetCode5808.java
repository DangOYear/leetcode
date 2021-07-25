package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/7/12
 */
public class LeetCode5808 {
    class Solution {
        public int[] getConcatenation(int[] nums) {
            int len = nums.length;
            int[] ans = new int[2 * len];
            for (int i = 0; i < len; i++) {
                ans[i] = nums[i];
                ans[i+len] = nums[i];
            }
            return ans;
        }
    }
}
