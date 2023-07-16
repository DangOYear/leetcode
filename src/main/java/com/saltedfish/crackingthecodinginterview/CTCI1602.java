package com.saltedfish.crackingthecodinginterview;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SaltedFish
 * @date 2021/6/2
 */
public class CTCI1602 {
    class WordsFrequency {

        private Map<String, Integer> bookCounter;

        public WordsFrequency(String[] book) {
            bookCounter = new HashMap<>();
            for (String b : book) {
                bookCounter.put(b, bookCounter.getOrDefault(b, 0) + 1);
            }
        }

        public int get(String word) {
            return bookCounter.getOrDefault(word, 0);
        }
    }
}
