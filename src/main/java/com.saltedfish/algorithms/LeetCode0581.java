package com.saltedfish.algorithms;

import java.util.Arrays;

/**
 * @author SaltedFish
 * @date 2021/3/11
 */
public class LeetCode0581 {
    class Solution {
        public int findUnsortedSubarray(int[] nums) {
            int[] sortedNums = nums.clone();
            Arrays.sort(sortedNums);
            int start = nums.length;
            int end = 0;
            for (int i = 0; i < sortedNums.length; i++) {
                if (sortedNums[i] != nums[i]) {
                    start = Math.min(start, i);
                    end = Math.max(end, i);
                }
            }
            return (end - start) >= 0 ? end - start + 1 : 0;
        }
    }
}
