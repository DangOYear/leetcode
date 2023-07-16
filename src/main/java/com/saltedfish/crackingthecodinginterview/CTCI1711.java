package com.saltedfish.crackingthecodinginterview;

public class CTCI1711 {
    class Solution {
        public int findClosest(String[] words, String word1, String word2) {
            int res = Integer.MAX_VALUE;
            int word1Index = -1;
            int word2Index = -1;

            for (int i = 0; i < words.length; ++i) {
                if (words[i].equals(word1)) {
                    word1Index = i;
                    if (word2Index != -1) {
                        res = Math.min(res, word1Index - word2Index);
                    }
                }


                if (words[i].equals(word2)) {
                    word2Index = i;
                    if (word1Index != -1) {
                        res = Math.min(res, word2Index - word1Index);
                    }
                }
            }
            return res;
        }
    }

}
