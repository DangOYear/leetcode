package com.saltedfish.codinginterviews;

public class CI0058II {
    class Solution {
        public String reverseLeftWords(String s, int n) {
            return s.substring(n) + s.substring(0, n);
        }
    }
}
