package com.saltedfish.algorithms;

import java.util.*;

public class LeetCode1608 {
    class Solution {
        public int specialArray(int[] nums) {
            List<Integer> numsList = new ArrayList<>();
            for (int x : nums) {
                numsList.add(x);
            }
            Collections.sort(numsList, Collections.reverseOrder());
            return -1;
        }
    }
}
