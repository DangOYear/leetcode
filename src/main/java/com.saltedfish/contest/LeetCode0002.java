package com.saltedfish.contest;

import java.util.*;

public class LeetCode0002 {
    class Solution {
        public int longestSquareStreak(int[] nums) {
            int[] flag = new int[100005];
            Set<Integer> set = new HashSet<>();
            for (int x : nums) {
                set.add(x);
            }
            Arrays.sort(nums);
            int res = -2;
            for (int x : nums) {
                if (set.contains(x * x)) {
                    flag[x * x] = flag[x] + 1;
                    res = Math.max(res, flag[x] + 1);
                }
            }
            return res + 1;
        }
    }
}
