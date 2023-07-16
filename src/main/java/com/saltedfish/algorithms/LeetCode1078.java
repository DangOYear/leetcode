package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SaltedFish
 * @date 2021/3/16
 */
public class LeetCode1078 {
    class Solution {
        public String[] findOcurrences(String text, String first, String second) {
            String[] words = text.split(" ");
            List<String> res = new ArrayList<>();
            for (int i = 0; i < words.length - 2; ++i) {
                if (words[i].equals(first) && words[i+1].equals(second)) {
                    res.add(words[i + 2]);
                    i++;
                }
            }
            return res.toArray(new String[res.size()]);
        }
    }
}
