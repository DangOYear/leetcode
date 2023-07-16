package com.saltedfish.codinginterviews;

import java.util.LinkedHashMap;
import java.util.Map;

public class CI0050 {
    class Solution {
        public char firstUniqChar(String s) {
            char res = ' ';
            Map<Character, Integer> count = new LinkedHashMap<>();
            for (char ch : s.toCharArray()) {
                count.put(ch, count.getOrDefault(ch, 0) + 1);
            }
            
            for (Map.Entry<Character, Integer> entry : count.entrySet()) {
                if (entry.getValue() == 1) {
                    res = entry.getKey();
                    break;
                }
            }
            return res;
        }
    }
}
