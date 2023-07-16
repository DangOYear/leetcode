package com.saltedfish.algorithms;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1309 {
    class Solution {
        public String freqAlphabets(String s) {

            Map<String, String> map = new HashMap<>();
            map.put("1", "a");
            map.put("2", "b");
            map.put("3", "c");
            map.put("4", "d");
            map.put("5", "e");
            map.put("6", "f");
            map.put("7", "g");
            map.put("8", "h");
            map.put("9", "i");
            map.put("10", "j");
            map.put("11", "k");
            map.put("12", "l");
            map.put("13", "m");
            map.put("14", "n");
            map.put("15", "o");
            map.put("16", "p");
            map.put("17", "q");
            map.put("18", "r");
            map.put("19", "s");
            map.put("20", "t");
            map.put("21", "u");
            map.put("22", "v");
            map.put("23", "w");
            map.put("24", "x");
            map.put("25", "y");
            map.put("26", "z");
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = s.length()-1; i >= 0; --i) {
                if (s.charAt(i) == '#') {
                    StringBuilder sb = new StringBuilder(map.get(s.substring(i-2, i)));
                    stringBuilder.append(sb);
                    i -= 2;
                }else {
                    StringBuilder sb = new StringBuilder(map.get(s.substring(i, i+1)));
                    stringBuilder.append(sb);
                }
            }
            return stringBuilder.reverse().toString();

        }
    }
}
