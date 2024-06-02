package com.saltedfish.algorithms;

import java.util.HashSet;
import java.util.Set;

public class LeetCode0575 {
    class Solution {
        public int distributeCandies(int[] candyType) {
            int n = candyType.length;

            Set<Integer> set = new HashSet<>();

            for (int num : candyType) {
                set.add(num);
            }

            int type = set.size();

            return type * 2 <= n ? type : n / 2;
        }
    }
}
