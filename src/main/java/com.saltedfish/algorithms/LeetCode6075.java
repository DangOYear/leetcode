package com.saltedfish.algorithms;

import java.util.Arrays;

public class LeetCode6075 {
    class Solution {
        public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
            int len = capacity.length;
            int[] left = new int[len];
            for (int i = 0; i < len; i++) {
                left[i] = capacity[i] - rocks[i];
            }

            Arrays.sort(left);
            int count = 0;
            for (int i = 0; i < len && additionalRocks > 0; i++) {
                if (additionalRocks - left[i] >= 0) {
                    additionalRocks -= left[i];
                    left[i] = 0;
                    ++count;
                } else {
                    additionalRocks = 0;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        LeetCode6075.Solution solution = new LeetCode6075().new Solution();
        int[] capacity = new int[]{2,3,4,5};
        int[] rocks = new int[]{1,2,4,4};

        int additionalRocks = 2;
        System.out.println(solution.maximumBags(capacity, rocks, additionalRocks));
    }
}
