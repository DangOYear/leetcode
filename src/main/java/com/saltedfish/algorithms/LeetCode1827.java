package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/5/5
 */
public class LeetCode1827 {
    class Solution {
        public int minOperations(int[] nums) {
            if (nums.length == 1) {
                return 0;
            }
            int res = 0;
            for (int i = 1; i < nums.length; i++) {
                int target = nums[i-1] + 1;
                if (target > nums[i]) {
                    res += target - nums[i];
                    nums[i] = target;
                }
            }
            return res;
        }
    }
}
