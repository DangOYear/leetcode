package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/17
 */
public class LeetCode0485 {
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int res = 0;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    ++count;
                } else {
                    res = Math.max(res, count);
                    count = 0;
                }
            }
            res = Math.max(count, res);
            return res;
        }
    }
}
