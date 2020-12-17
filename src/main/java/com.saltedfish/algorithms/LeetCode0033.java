package com.saltedfish.algorithms;

public class LeetCode0033 {

    class Solution {
        public int find(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            int mid = 0;
            while (left <= right) {
                mid = (left + right) / 2;
                if (nums[mid] == target)
                    return mid;
                if (nums[left] <= nums[mid]) {
                    if (nums[left] <= target && target <= nums[mid]) {
                        right = mid - 1;
                    }else {
                        left = mid + 1;
                    }
                }else {
                    if (nums[mid] < target && target <= nums[right]) {
                        left = mid + 1;
                    }else {
                        right = mid - 1;
                    }
                }
            }
            return -1;
        }

        public int search(int[] nums, int target) {
            return find(nums, target);
        }
    }
}
