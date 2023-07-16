package com.saltedfish.crackingthecodinginterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author SaltedFish
 * @date 2021/6/7
 */
public class CTCI1620 {

    class Solution {
        public List<String> getValidT9Words(String num, String[] words) {
            Map<Character, Character> map = new HashMap<>();
            map.put('a', '2');
            map.put('b', '2');
            map.put('c', '2');

            map.put('d', '3');
            map.put('e', '3');
            map.put('f', '3');

            map.put('g', '4');
            map.put('h', '4');
            map.put('i', '4');

            map.put('j', '5');
            map.put('k', '5');
            map.put('l', '5');

            map.put('m', '6');
            map.put('n', '6');
            map.put('o', '6');

            map.put('p', '7');
            map.put('q', '7');
            map.put('r', '7');
            map.put('s', '7');

            map.put('t', '8');
            map.put('u', '8');
            map.put('v', '8');

            map.put('w', '9');
            map.put('x', '9');
            map.put('y', '9');
            map.put('z', '9');

            List<String> res = new ArrayList<>();
            for (String word : words) {
                boolean flag = true;
                for (int i = 0; i < word.length(); i++) {
                    if (map.get(word.charAt(i)) != num.charAt(i)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    res.add(word);
                }
            }
            return res;
        }
    }
}
