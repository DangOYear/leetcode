package com.saltedfish.algorithms;

public class LeetCode1641 {
    class Solution {
        public int countVowelStrings(int n) {
            return (n + 4) * (n + 3) * (n + 2) * (n + 1) / 24;
        }
    }
}
