package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author SaltedFish
 * @date 2021/5/20
 */
public class LeetCode0692 {
    class Solution {
        public List<String> topKFrequent(String[] words, int k) {
            List<String> res = new ArrayList<>();

            Map<String, Integer> wordsCount = new HashMap<>();
            for (String word : words) {
                wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
            }

            for (String key : wordsCount.keySet()) {
                res.add(key);
            }

            Collections.sort(res, (word1, word2) -> wordsCount.get(word1).equals(wordsCount.get(word2)) ? word1.compareTo(word2) : wordsCount.get(word2) - wordsCount.get(word1));

            return res.subList(0, k);
        }
    }
}
