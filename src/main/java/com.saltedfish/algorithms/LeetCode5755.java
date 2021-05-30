package com.saltedfish.algorithms;

import java.util.Arrays;

/**
 * @author SaltedFish
 * @date 2021/5/30
 */
public class LeetCode5755 {
    class Solution {
        public int minPairSum(int[] nums) {
            int res = 0;
            Arrays.sort(nums);
            for (int i = 0; i < nums.length / 2; i++) {
                res = Math.max(res, nums[i] + nums[nums.length-1-i]);
            }
            return res;
        }
    }
}
