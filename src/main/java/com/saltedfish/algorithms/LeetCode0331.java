package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/14
 */
public class LeetCode0331 {
    class Solution {
        public boolean isValidSerialization(String preorder) {
            int slot = 1;
            for (int i = 0; i < preorder.length(); i++) {
                if (slot == 0) {
                    return false;
                }

                if (preorder.charAt(i) == ',') {
                    ++i;
                } else if (preorder.charAt(i) == '#') {
                    slot--;
                    i++;
                } else {
                    while (i < preorder.length() && preorder.charAt(i) != ',') {
                        ++i;
                    }
                    slot++;
                }
            }
            return slot == 0;
        }
    }
}
