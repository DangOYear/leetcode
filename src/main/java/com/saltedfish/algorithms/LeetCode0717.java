package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/17
 */
public class LeetCode0717 {
    class Solution {
        public boolean isOneBitCharacter(int[] bits) {
            int pos = 0;
            while (pos < bits.length - 1) {
                if (bits[pos] == 1) {
                    pos += 2;
                } else {
                    pos += 1;
                }
            }
            return pos == bits.length - 1;
        }
    }
}
