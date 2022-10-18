package com.saltedfish.algorithms;

import java.util.*;

public class LeetCode2442 {
    class Solution {
        public int countDistinctIntegers(int[] nums) {
            Set<Integer> s = new HashSet<>();
            for (int x : nums) {
                s.add(x);
                String reverseStr = new StringBuilder(String.valueOf(x)).reverse().toString();
                int y = Integer.parseInt(reverseStr);
                s.add(y);
            }
            return s.size();
        }
    }
}
