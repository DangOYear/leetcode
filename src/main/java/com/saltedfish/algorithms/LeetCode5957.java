package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/12/19
 */
public class LeetCode5957 {
    class Solution {
        public String addSpaces(String s, int[] spaces) {
            StringBuilder res = new StringBuilder();
            int beginIndex = 0;
            for (int space : spaces) {
                res.append(s.substring(beginIndex, space));
                res.append(" ");
                beginIndex = space;
            }
            res.append(s.substring(beginIndex));
            return res.toString();
        }
    }

}
