package com.saltedfish.algorithms;

public class LeetCode6253 {
    class Solution {
        public boolean isCircularSentence(String sentence) {
            String[] words = sentence.split(" ");
            int len = words.length;
            for (int i = 0; i < len; i++) {
                if (words[i].charAt(words[i].length()-1) != words[(i+1) % len].charAt(0))
                    return false;
            }
            return true;
        }
    }
}
