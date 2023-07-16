package com.saltedfish.algorithms;

public class LeetCode1365 {


    class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {

            int[] res = new int[nums.length];

            int[] cnt = new int[101];

            for (int x:nums) {
                cnt[x]++;
            }

            for (int i = 1; i < 101; ++i) {
                cnt[i] += cnt[i-1];
            }

            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] > 0)
                    res[i] = cnt[nums[i]-1];
            }
            return res;
        }
    }
}
