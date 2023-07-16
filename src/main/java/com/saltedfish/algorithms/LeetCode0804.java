package com.saltedfish.algorithms;


import java.util.HashSet;

public class LeetCode0804 {
    class Solution {
        public int uniqueMorseRepresentations(String[] words) {
            HashSet<String> hashMap = new HashSet<>();
            String [] morsecode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
            for (int i = 0; i < words.length; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < words[i].length(); j++) {
                    sb.append(morsecode[words[i].charAt(j) - 'a']);
                }
                hashMap.add(sb.toString());
            }
            return hashMap.size();
        }
    }
}
