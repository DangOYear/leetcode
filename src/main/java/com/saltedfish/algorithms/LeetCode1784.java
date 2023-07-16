package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/17
 */
public class LeetCode1784 {
    class Solution {
        public boolean checkOnesSegment(String s) {
            return s.indexOf("01") == -1;
        }
    }
}
