package com.saltedfish.algorithms;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1160 {
    class Solution {
        public int countCharacters(String[] words, String chars) {
            Map<Character, Integer> charMap = new HashMap<>();
            int res = 0;
            for (char ch:chars.toCharArray()) {
                charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
            }

            for (String str:words) {
                boolean isLegal = true;
                Map<Character, Integer> strMap = new HashMap<>();
                for (char ch:str.toCharArray()) {
                    strMap.put(ch, strMap.getOrDefault(ch, 0) + 1);
                }

                for (char ch:strMap.keySet()) {
                    if (strMap.get(ch) > charMap.getOrDefault(ch, 0)) {
                        isLegal = false;
                        break;
                    }
                }

                if (isLegal) {
                    res += str.length();
                }
            }
            return res;

        }
    }
}
