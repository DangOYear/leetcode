package com.saltedfish.algorithms;

import java.util.HashMap;
import java.util.Map;

public class LeetCode6124 {
    class Solution {
        public char repeatedCharacter(String s) {
            Map<Character, Integer> count = new HashMap<>();
            char res = 'a';
            for (int i = 0; i < s.length(); i++) {
                char temp = s.charAt(i);
                count.put(temp, count.getOrDefault(temp, 0) + 1);
                if (count.get(temp) >= 2) {
                    res = temp;
                    break;
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        LeetCode6124.Solution solution = new LeetCode6124().new Solution();
        System.out.println(solution.repeatedCharacter("abccbaacz"));
        System.out.println(solution.repeatedCharacter("abcdd"));
    }
}
