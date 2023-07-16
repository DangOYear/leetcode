package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/8
 */
public class LeetCode0055 {
    class Solution {
        public boolean canJump(int[] nums) {
            int maxLength = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i <= maxLength) {
                    maxLength = Math.max(maxLength, nums[i] + i);
                    if (maxLength >= nums.length - 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
