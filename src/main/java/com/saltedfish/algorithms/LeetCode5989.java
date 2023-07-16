package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2022/1/23
 */
public class LeetCode5989 {
    class Solution {
        public int countElements(int[] nums) {
            int maxValue = Integer.MIN_VALUE;
            int minValue = Integer.MAX_VALUE;
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                maxValue = Math.max(nums[i], maxValue);
                minValue = Math.min(nums[i], minValue);
            }

            if (maxValue == minValue) {
                return 0;
            }

            int res = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] != maxValue && nums[i] != minValue) {
                    ++res;
                }
            }
            return res;
        }
    }
}
