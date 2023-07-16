package com.saltedfish.algorithms;

import java.util.Arrays;

/**
 * @author SaltedFish
 * @date 2021/4/26
 */
public class LeetCode1833 {
    class Solution {
        public int maxIceCream(int[] costs, int coins) {
            int res = 0;
            Arrays.sort(costs);
            for (int cost : costs) {
                if (coins - cost >= 0) {
                    ++res;
                    coins -= cost;
                } else {
                    break;
                }
            }
            return res;
        }
    }
}
