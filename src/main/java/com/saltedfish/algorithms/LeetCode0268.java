package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/17
 */
public class LeetCode0268 {
    class Solution {
        public int missingNumber(int[] nums) {
            int res = nums.length;
            for (int i = 0; i < nums.length; i++) {
                res ^= nums[i];
                res ^= i;
            }
            return res;
        }
    }
}
