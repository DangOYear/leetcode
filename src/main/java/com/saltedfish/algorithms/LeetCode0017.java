package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author SaltedFish
 * @date 2021/3/9
 */
public class LeetCode0017 {
    class Solution {
        public List<String> letterCombinations(String digits) {
            List<String> res = new ArrayList<>();
            if (digits.length() == 0) {
                return res;
            }
            Map<Character, String> keyPadMap = new HashMap<Character, String>() {{
                put('2', "abc");
                put('3', "def");
                put('4', "ghi");
                put('5', "jkl");
                put('6', "mno");
                put('7', "pqrs");
                put('8', "tuv");
                put('9', "wxyz");
            }};
            backstrack(res, keyPadMap, digits, 0, new StringBuilder());
            return res;
        }

        private void backstrack(List<String> res, Map<Character, String> keyPadMap, String digits, int index, StringBuilder combine) {
            if (index == digits.length()) {
                res.add(combine.toString());
            } else {
                char digit = digits.charAt(index);
                String letters = keyPadMap.get(digit);
                for (int i = 0; i < letters.length(); i++) {
                    combine.append(letters.charAt(i));
                    backstrack(res, keyPadMap, digits, index + 1, combine);
                    combine.deleteCharAt(index);
                }
            }
        }
    }
}
