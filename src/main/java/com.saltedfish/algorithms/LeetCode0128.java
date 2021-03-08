package com.saltedfish.algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * @author SaltedFish
 * @date 2021/3/8
 */
public class LeetCode0128 {
    class Solution {
        public int longestConsecutive(int[] nums) {
            Set<Integer> numSet = new HashSet<>();
            for (int x : nums) {
                numSet.add(x);
            }

            int longestCount = 0;

            for (int num : numSet) {
                if (!numSet.contains(num - 1)) {
                    int curNum = num;
                    int curCount = 1;

                    while (numSet.contains(curNum + 1)) {
                        curNum++;
                        curCount++;
                    }

                    longestCount = Math.max(longestCount, curCount);
                }
            }
            return longestCount;
        }
    }
}
