package com.saltedfish.algorithms;

import java.util.HashSet;
import java.util.Set;

public class LeetCode0217 {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();

            for (int x:nums) {
                if (set.contains(x))
                    return true;
                else
                    set.add(x);
            }
            return false;
        }
    }
}
