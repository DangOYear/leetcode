package com.saltedfish.algorithms;

public class LeetCode2562 {
    class Solution {
        public long findTheArrayConcVal(int[] nums) {
            int l = 0;
            int r = nums.length - 1;
            long res = 0;
            while (l <= r) {
                if (l == r) {
                    res += nums[l];
                } else {
                    res += Integer.parseInt(Integer.toString(nums[l]) + Integer.toString(nums[r]));
                }
                l++;
                r--;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        LeetCode2562.Solution solution = new LeetCode2562().new Solution();

        int[] nums = new int[]{7,52,2,4};
        System.out.println(solution.findTheArrayConcVal(nums));
    }
}
