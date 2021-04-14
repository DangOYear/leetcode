package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/4/14
 */
public class LeetCode1812 {
    class Solution {
        public boolean squareIsWhite(String coordinates) {
            int a = (coordinates.charAt(0) - 'a') % 2;
            int b = (coordinates.charAt(1) - '0') % 2;
            return (a ^ b) == 0;
        }
    }
}
