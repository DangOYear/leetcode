package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/5/20
 */
public class LeetCode1863 {
    class Solution {

        private int res;

        private void dfs(int val, int index, int[] nums) {
            if (index == nums.length) {
                res += val;
                return;
            }

            dfs(val ^ nums[index], index + 1, nums);
            dfs(val, index + 1, nums);
        }

        public int subsetXORSum(int[] nums) {
            res = 0;
            dfs(0, 0, nums);
            return res;
        }
    }
}
