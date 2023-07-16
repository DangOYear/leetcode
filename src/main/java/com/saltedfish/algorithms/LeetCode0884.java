package com.saltedfish.algorithms;


import java.util.*;

public class LeetCode0884 {
    class Solution {
        public String[] uncommonFromSentences(String A, String B) {
            List<String> res = new ArrayList<>();
            Map<String, Integer> count = new HashMap<>();

            for (String word:A.split(" ")) {
                count.put(word, count.getOrDefault(word, 0) + 1);
            }


            for (String word:B.split(" ")) {
                count.put(word, count.getOrDefault(word, 0) + 1);
            }

            for (String word:count.keySet()) {
                if (count.get(word) == 1)
                    res.add(word);
            }

            return res.toArray(new String[res.size()]);
        }
    }
}
