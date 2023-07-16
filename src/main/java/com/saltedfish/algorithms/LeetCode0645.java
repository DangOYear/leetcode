package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/7/4
 */
public class LeetCode0645 {
    class Solution {
        public int[] findErrorNums(int[] nums) {
            int n = nums.length;
            int[] count = new int[n+1];
            for (int x : nums) {
                count[x]++;
            }
            int[] res = new int[2];
            for (int i = 1; i < count.length; i++) {
                if (count[i] == 0) {
                    res[1] = i;
                }

                if (count[i] == 2) {
                    res[0] = i;
                }
            }
            return res;
        }
    }
}
