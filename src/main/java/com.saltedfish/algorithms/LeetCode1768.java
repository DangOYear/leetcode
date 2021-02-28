package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/2/28
 */
public class LeetCode1768 {
    class Solution {
        public String mergeAlternately(String word1, String word2) {
            int len1 = word1.length();
            int len2 = word2.length();

            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < len1 || i < len2; ++i) {
                if (i < len1) {
                    stringBuffer.append(word1.charAt(i));
                }

                if (i < len2) {
                    stringBuffer.append(word2.charAt(i));
                }
            }
            return stringBuffer.toString();
        }
    }
}
