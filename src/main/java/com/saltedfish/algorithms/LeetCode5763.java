package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/5/23
 */
public class LeetCode5763 {
    class Solution {
        public boolean checkZeroOnes(String s) {
            int zeroLen = 0;
            int oneLen = 0;

            int zeroMax = 0;
            int oneMax = 0;

            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zeroLen++;
                    oneLen = 0;
                } else {
                    oneLen++;
                    zeroLen = 0;
                }

                zeroMax = Math.max(zeroMax, zeroLen);
                oneMax = Math.max(oneMax, oneLen);
            }
            return oneMax > zeroMax;
        }
    }
}
