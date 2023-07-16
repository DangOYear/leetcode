package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author SaltedFish
 * @date 2021/3/8
 */
public class LeetCode0049 {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();
            for (String str : strs) {
                int[] counts = new int[26];
                for (int i = 0; i < str.length(); i++) {
                    counts[str.charAt(i) - 'a']++;
                }

                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < 26; i++) {
                    if (counts[i] != 0) {
                        stringBuilder.append((char) ('a' + i));
                        stringBuilder.append(counts[i]);
                    }
                }

                String key = stringBuilder.toString();
                List<String> strList = map.getOrDefault(key, new ArrayList<String>());
                strList.add(str);
                map.put(key, strList);
            }
            return new ArrayList<>(map.values());
        }
    }
}
