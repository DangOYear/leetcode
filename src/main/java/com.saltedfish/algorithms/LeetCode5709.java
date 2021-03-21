package com.saltedfish.algorithms;

import java.util.Stack;

/**
 * @author SaltedFish
 * @date 2021/3/21
 */
public class LeetCode5709 {
    class Solution {
        public int maxAscendingSum(int[] nums) {
            int count = 0;
            int res = 0;
            for (int i = 0; i < nums.length; i++) {
                count += nums[i];
                while (i < nums.length -1 && nums[i] < nums[i+1]) {
                    count += nums[i+1];
                    ++i;
                }
                res = Math.max(res, count);
                count = 0;
            }
            return res;
        }

    }

    public static void main(String[] args) {
        int[] nums = new int[]{10};
        LeetCode5709.Solution solution = new LeetCode5709().new Solution();
        System.out.println(solution.maxAscendingSum(nums));
    }

}
