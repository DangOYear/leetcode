package com.saltedfish.algorithms;

import java.util.*;


public class LeetCode6132 {
    class Solution {
        public int minimumOperations(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int x : nums) {
                if (x != 0) {
                    set.add(x);
                }
            }
            return set.size();
        }
    }
}
