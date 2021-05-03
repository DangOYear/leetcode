package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/5/3
 */
public class LeetCode1832 {
    class Solution {
        public boolean checkIfPangram(String sentence) {
            int[] alpha = new int[26];
            int res = 0;
            for (char ch : sentence.toCharArray()) {
                alpha[ch - 'a'] = 1;
            }
            for (int i = 0; i < alpha.length; i++) {
                res += alpha[i];
            }
            return res == 26;
        }
    }
}
