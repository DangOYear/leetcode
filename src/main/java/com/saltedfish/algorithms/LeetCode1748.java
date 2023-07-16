package com.saltedfish.algorithms;

import java.util.Map;

/**
 * @author SaltedFish
 * @date 2021/2/11
 */
public class LeetCode1748 {
    class Solution {
        public int sumOfUnique(int[] nums) {
            int[] count = new int[101];
            for (int x : nums) {
                count[x]++;
            }
            int sum = 0;
            for (int i = 0; i < count.length; ++i) {
                sum += count[i] == 1 ? i : 0;
            }
            return sum;
        }
    }
}
