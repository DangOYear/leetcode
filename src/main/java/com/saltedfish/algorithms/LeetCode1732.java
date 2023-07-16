package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/2/11
 */
public class LeetCode1732 {
    class Solution {
        public int largestAltitude(int[] gain) {
            int altitudes = 0;
            int altitudesMax = 0;
            for (int x : gain) {
                altitudes += x;
                altitudesMax = Math.max(altitudes, altitudesMax);
            }
            return altitudesMax;
        }
    }
}
