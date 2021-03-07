package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0046 {
    class Solution {
        private void swap(int[] nums, int left, int right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }

        private void backtracking(int[] nums, List<Integer> output, List<List<Integer>> res, int pos) {
            if (pos == nums.length) {
                res.add(new ArrayList<>(output));
            }

            for (int i = pos; i < nums.length; ++i) {
                output.add(nums[i]);
                swap(nums, pos, i);
                backtracking(nums, output, res, pos + 1);
                output.remove(output.size() - 1);
                swap(nums, pos, i);
            }
        }


        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> output = new ArrayList<>();
            backtracking(nums, output, res, 0);
            return res;
        }

    }
}
