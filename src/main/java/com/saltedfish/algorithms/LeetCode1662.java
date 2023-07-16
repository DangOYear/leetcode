package com.saltedfish.algorithms;

public class LeetCode1662 {
    class Solution {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            StringBuilder words1 = new StringBuilder();
            StringBuilder words2 = new StringBuilder();
            for (String str : word1) {
                words1.append(str);
            }
            for (String str : word2) {
                words2.append(str);
            }
            return words1.toString().equals(words2.toString());
        }
    }
}
