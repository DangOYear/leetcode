package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/5/5
 */
public class LeetCode1370 {
    class Solution {
        public String sortString(String s) {
            StringBuilder res = new StringBuilder();
            int[] count = new int[26];

            for (char ch : s.toCharArray()) {
                count[ch - 'a']++;
            }

            while (res.length() < s.length()) {
                for (int i = 0; i < 26; i++) {
                    if (count[i] > 0) {
                        res.append((char)(i + 'a'));
                        count[i]--;
                    }
                }

                for (int i = 25; i >= 0; i--) {
                    if (count[i] > 0) {
                        res.append((char)(i + 'a'));
                        count[i]--;
                    }
                }
            }
            return res.toString();
        }
    }
}
