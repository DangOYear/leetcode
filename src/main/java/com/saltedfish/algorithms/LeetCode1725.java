package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/5/5
 */
public class LeetCode1725 {
    class Solution {
        public int countGoodRectangles(int[][] rectangles) {
            int maxLen = 0;
            int count = 0;
            for (int[] rectangle : rectangles) {
                int tempLen = Math.min(rectangle[0], rectangle[1]);
                if (tempLen > maxLen) {
                    count = 1;
                    maxLen = tempLen;
                } else {
                    if (tempLen == maxLen) {
                        ++count;
                    }
                }
            }
            return count;
        }
    }
}
