package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2022/2/2
 */
public class LeetCode2000 {
    class Solution {
        public String reversePrefix(String word, char ch) {
            int index = word.indexOf(ch);
            StringBuilder res = new StringBuilder();
            res.append(word, 0, index + 1);
            res.reverse();
            res.append(word.substring(index + 1));
            return res.toString();
        }
    }
}
