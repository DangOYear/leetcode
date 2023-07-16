package com.saltedfish.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SaltedFish
 * @date 2021/3/14
 */
public class LeetCode5701 {
    class Solution {
        public boolean areAlmostEqual(String s1, String s2) {
            int length = s1.length();
            if (length == 0 || s1.equals(s2)) {
                return true;
            }
            Map<Character, Character> map = new HashMap();
            for (int i = 0; i < length; i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    if (map.size() > 2 || map.containsKey(s1.charAt(i))) {
                        return false;
                    } else if (map.size() == 1) {
                        if (!map.containsKey(s2.charAt(i)) || map.get(s2.charAt(i)) != s1.charAt(i)) {
                            return false;
                        }
                    }
                    map.put(s1.charAt(i), s2.charAt(i));
                }
            }
            return map.size() == 2;
        }
    }

    public static void main(String[] args) {
        LeetCode5701.Solution solution = new LeetCode5701().new Solution();
        String str1 = "abb";
        String str2 = "baa";
        System.out.println(solution.areAlmostEqual(str1, str2));
    }
}
