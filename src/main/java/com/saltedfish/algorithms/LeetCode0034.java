package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/8
 */
public class LeetCode0034 {
    class Solution {

        private int binarySearch(int[] nums, int target, boolean getFirst) {
            int left = 0;
            int right = nums.length - 1;
            int res = nums.length;

            while (left <= right) {
                int mid = (left + right) / 2;
                if (nums[mid] > target || (getFirst && nums[mid] >= target)) {
                    right = mid - 1;
                    res = mid;
                } else {
                    left = mid + 1;
                }
            }
            return res;
        }

        public int[] searchRange(int[] nums, int target) {
            int leftIndex = binarySearch(nums, target, true);
            int rightIndex = binarySearch(nums, target, false) - 1;
            if (leftIndex <= rightIndex && rightIndex < nums.length && nums[leftIndex] == target && nums[rightIndex] == target) {
                return new int[]{leftIndex, rightIndex};
            }
            return new int[]{-1, -1};
        }
    }
}
