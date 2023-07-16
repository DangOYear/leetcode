package com.saltedfish.algorithms;

import java.util.Arrays;

public class LeetCode1561 {
    class Solution {
        public int maxCoins(int[] piles) {
            Arrays.sort(piles);
            int index = piles.length - 2;
            int round = piles.length / 3;
            int res = 0;
            for (int i = 0; i < round; ++i) {
                res += piles[index];
                index -= 2;
            }
            return res;
        }
    }
}
