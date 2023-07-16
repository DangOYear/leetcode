package com.saltedfish.algorithms;

public class LeetCode0392 {
    class Solution {
        public boolean isSubsequence(String s, String t) {
            char[] chars = s.toCharArray();
            int pos = -1;
            for (int i = 0; i < chars.length; ++i) {
                pos = t.indexOf(chars[i], pos+1);
                if (pos == -1)
                    return false;
            }
            return true;
        }
    }
}
