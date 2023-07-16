package com.saltedfish.algorithms;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1684 {
    class Solution {
        public int countConsistentStrings(String allowed, String[] words) {
            int res = 0;
            Map<Character, Integer> allowedMap = new HashMap<>();
            for (char ch : allowed.toCharArray()) {
                allowedMap.put(ch, allowedMap.getOrDefault(ch, 0));
            }
            for (String word : words) {
                for (int i = 0; i < word.length(); ++i) {
                    if (!allowedMap.containsKey(word.charAt(i))) {
                        break;
                    }
                    if (i == word.length() - 1) {
                        ++res;
                    }
                }
            }
            return res;
        }
    }
}
