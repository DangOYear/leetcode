package com.saltedfish.algorithms;

public class LeetCode0035 {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;
            int mid;
            while (low <= high) {
                mid = (low + high) / 2;
                if (nums[mid] == target)
                    return mid;
                if (nums[mid] < target) {
                    low = mid + 1;
                }else {
                    high = mid - 1;
                }
            }

            return low;
        }
    }
}
