package com.saltedfish.algorithms;

import java.util.*;

public class LeetCode0384 {
    class Solution {

        int[] origin;
        int[] now;
        public Solution(int[] nums) {
            origin = Arrays.copyOf(nums, nums.length);
            now = Arrays.copyOf(nums, nums.length);
        }

        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            now = Arrays.copyOf(origin, origin.length);
            return now;
        }

        /** Returns a random shuffling of the array. */
        public int[] shuffle() {
            List<Integer> list = new ArrayList(Arrays.asList(now));
            Collections.shuffle(list);
            return now;
        }
    }

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
}
