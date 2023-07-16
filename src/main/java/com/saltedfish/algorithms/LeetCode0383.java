package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/17
 */
public class LeetCode0383 {
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            char[] ransomNoteCnt = new char[26];
            char[] magazineCnt = new char[26];
            for (char ch : magazine.toCharArray()) {
                magazineCnt[ch-'a']++;
            }
            for (char ch : ransomNote.toCharArray()) {
                ransomNoteCnt[ch-'a']++;
                if (ransomNoteCnt[ch-'a'] > magazineCnt[ch-'a']) {
                    return false;
                }
            }
            return true;
        }
    }
}
