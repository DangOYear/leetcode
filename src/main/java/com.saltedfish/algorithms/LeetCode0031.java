package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/23
 */
public class LeetCode0031 {
    class Solution {

        private void swap(int[] nums, int i , int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        private void reverse(int[] nums, int start) {
            int left = start;
            int right = nums.length - 1;
            while (left < right) {
                swap(nums, left, right);
                ++left;
                --right;
            }
        }

        public void nextPermutation(int[] nums) {
            int i = nums.length - 2;
            while (i >= 0 && nums[i] >= nums[i+1]) {
                i--;
            }
            if (i >= 0) {
                int j = nums.length - 1;
                while (j >= 0 && nums[i] >= nums[j]) {
                    j--;
                }
                swap(nums, i, j);
            }
            reverse(nums, i + 1);
        }
    }

}