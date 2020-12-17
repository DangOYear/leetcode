package com.saltedfish.algorithms;

public class LeetCode0075 {
    class Solution {
        public void sortColors(int[] nums) {
            int[] color = new int[3];
            for (int x : nums) {
                color[x]++;
            }
            int pos = 0;
            for (int i = 0; i < color.length; ++i) {
                for (int j = 0; j < color[i]; ++j) {
                    nums[pos++] = i;
                }
            }
        }
    }
}
