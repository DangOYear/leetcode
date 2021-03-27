package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/27
 */
public class LeetCode1518 {
    class Solution {
        public int numWaterBottles(int numBottles, int numExchange) {
            int res = numBottles;
            while (numBottles >= numExchange) {
                int change = numBottles / numExchange;
                res += change;
                numBottles -= change * numExchange;
                numBottles += change;
            }
            return res;
        }
    }
}
