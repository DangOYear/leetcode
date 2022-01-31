package com.saltedfish.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author SaltedFish
 * @date 2022/1/31
 */
public class LeetCode2154 {
    class Solution {
        public int findFinalValue(int[] nums, int original) {
            Set<Integer> s = new HashSet<>();
            for (int x : nums) {
                s.add(x);
            }
            while (s.contains(original)) {
                original = original << 1;
            }
            return original;
        }
    }
}
