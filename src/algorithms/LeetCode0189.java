package src.algorithms;

public class LeetCode0189 {
    class Solution {
        public void rotate(int[] nums, int k) {
            k %= nums.length;
            reverse(0, nums.length-1, nums);
            reverse(0, k-1, nums);
            reverse(k, nums.length-1, nums);

        }

        void reverse(int left, int right, int[] nums) {
            while(left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                ++left;
                --right;
            }
        }
    }
}

