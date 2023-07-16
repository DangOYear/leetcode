package com.saltedfish.contest;

public class LeetCode6298 {
    class Solution {
        public boolean makeStringsEqual(String s, String target) {
            return s.contains("1") == target.contains("1");
        }
    }
}
