package com.saltedfish.algorithms;

public class LeetCode1217 {
    class Solution {
        public int minCostToMoveChips(int[] position) {
            int odd = 0;
            int even = 0;
            for (int pos : position) {
                if (pos % 2 == 1) {
                    ++even;
                } else {
                    ++odd;
                }
            }
            return Math.min(even, odd);
        }
    }
}
