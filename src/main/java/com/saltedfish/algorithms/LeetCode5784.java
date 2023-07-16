package com.saltedfish.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SaltedFish
 * @date 2021/6/13
 */
public class LeetCode5784 {
    class Solution {
        public boolean makeEqual(String[] words) {
            int n = words.length;
            boolean flag = true;
            Map<Character, Integer> count = new HashMap<>();

            for (String word : words) {
                for (char ch : word.toCharArray()) {
                    count.put(ch, count.getOrDefault(ch, 0) + 1);
                }
            }

            for (Integer c : count.values()) {
                if (c % n != 0) {
                    flag = false;
                    break;
                }
            }

            return flag;
        }
    }
}
