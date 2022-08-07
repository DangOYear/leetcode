package com.saltedfish.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode6136 {
    class Solution {
        public int arithmeticTriplets(int[] nums, int diff) {
            int count = 0;
            Set<Integer> set = new HashSet<>();
            for (int x : nums) {
                set.add(x);
            }
            for (int x : nums) {
                if (set.contains(x + diff) && set.contains(x + diff + diff)) {
                    ++count;
                }
            }
            return count;
        }
    }
}
