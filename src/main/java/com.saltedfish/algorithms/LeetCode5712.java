package com.saltedfish.algorithms;

import java.util.Arrays;

/**
 * @author SaltedFish
 * @date 2021/3/21
 */
public class LeetCode5712 {
    class Solution {
        public int getMaximumConsecutive(int[] coins) {
            Arrays.sort(coins);
            int res = 0;
            for (int coin : coins) {
                if(coin > res + 1) {
                    break;
                }
                res += coin;
            }
            return res + 1;
        }
    }
}
