package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/6/1
 */
public class LeetCode1528 {
    class Solution {
        public String restoreString(String s, int[] indices) {
            char[] res = new char[s.length()];
            for (int i = 0; i < s.length(); i++) {
                res[indices[i]] = s.charAt(i);
            }
            return new String(res);
        }
    }
}
