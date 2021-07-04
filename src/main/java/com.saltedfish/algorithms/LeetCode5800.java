package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/7/4
 */
public class LeetCode5800 {
    class Solution {
        public int[] buildArray(int[] nums) {
            int n = nums.length;
            int[] res = new int[n];

            for (int i = 0; i < n; i++) {
                res[i] = nums[nums[i]];
            }
            return res;
        }
    }
}
