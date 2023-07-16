package com.saltedfish.crackingthecodinginterview;

import java.util.Arrays;

/**
 * @author SaltedFish
 * @date 2021/6/2
 */
public class CTCI1011 {
    class Solution {
        public void wiggleSort(int[] nums) {
            int[] temp = Arrays.copyOf(nums, nums.length);
            Arrays.sort(temp);
            int left = 0;
            int right = nums.length - 1;
            for (int i = 0; i < nums.length; i++) {
                if (i % 2 == 0) {
                    nums[i] = temp[right];
                    --right;
                } else {
                    nums[i] = temp[left];
                    ++left;
                }
            }
        }
    }
}
