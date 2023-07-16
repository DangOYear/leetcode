package com.saltedfish.algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode0151 {
    class Solution {
        public String reverseWords(String s) {
            s = s.trim();
            List<String> words = Arrays.asList(s.split("\\s+"));
            Collections.reverse(words);
            return String.join(" ", words);

        }
    }
}
