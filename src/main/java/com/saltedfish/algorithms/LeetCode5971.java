package com.saltedfish.algorithms;

import java.util.Arrays;

/**
 * @author SaltedFish
 * @date 2022/1/22
 */
public class LeetCode5971 {
    class Solution {
        public int minimumCost(int[] cost) {
            Arrays.sort(cost);
            int res = 0;
            int i = cost.length - 1;
            while (i >= 0) {
                if (i >= 0) {
                    res += cost[i];
                }
                if (i >= 1) {
                    res += cost[i-1];
                }
                i -= 3;
            }
            return res;
        }
    }
}
