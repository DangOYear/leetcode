package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2022/1/23
 */
public class LeetCode5991 {
    class Solution {
        public int[] rearrangeArray(int[] nums) {
            int n = nums.length;
            int[] positive = new int[n/2];
            int[] negtive = new int[n/2];
            for (int i = 0, i1 = 0, i2 = 0; i < n; i++) {
                if (nums[i] > 0) {
                    positive[i1++] = nums[i];
                }

                if (nums[i] < 0) {
                    negtive[i2++] = nums[i];
                }
            }

            int[] res = new int[n];
            int i = 0;
            int i1 = 0;
            int i2 = 0;
            while (i < n) {
                res[i++] = positive[i1++];
                res[i++] = negtive[i2++];
            }
            return res;
        }
    }
}
