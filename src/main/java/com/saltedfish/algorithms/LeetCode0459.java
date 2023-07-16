package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/17
 */
public class LeetCode0459 {
    class Solution {
        public boolean repeatedSubstringPattern(String s) {
            return (s + s).indexOf(s, 1) != s.length();
        }
    }
}
