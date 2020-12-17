package com.saltedfish.algorithms;

public class LeetCode0303 {
    class NumArray {
        int[] data;
        public NumArray(int[] nums) {
            data = new int[nums.length+1];
            int prefixSum = 0;
            for (int i = 1; i <= nums.length; ++i) {
                prefixSum += nums[i-1];
                data[i] =  prefixSum;
            }
        }

        public int sumRange(int i, int j) {
            return data[j+1] - data[i];
        }
    }

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
}
