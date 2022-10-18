package com.saltedfish.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode2441 {
    class Solution {
        public int findMaxK(int[] nums) {
            int res = -1;
            Set<Integer> s = new HashSet<>();
            for (int x : nums) {
                if (s.contains(-x)) {
                    res = Math.max(res, Math.abs(x));
                } else {
                    s.add(x);
                }
            }
            return res;
        }
    }
}
