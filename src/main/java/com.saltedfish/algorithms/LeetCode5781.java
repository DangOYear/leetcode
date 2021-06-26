package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/6/26
 */
public class LeetCode5781 {
    class Solution {
        public String removeOccurrences(String s, String part) {

            while (s.indexOf(part) != -1) {
                int pos = s.indexOf(part);

                s = s.substring(0, pos) + s.substring(pos + part.length());
            }
            return s;
        }
    }

    public static void main(String[] args) {
        LeetCode5781.Solution solution = new LeetCode5781().new Solution();
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.println(solution.removeOccurrences(s, part));
    }
}
