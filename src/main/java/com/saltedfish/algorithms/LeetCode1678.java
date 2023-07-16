package com.saltedfish.algorithms;

public class LeetCode1678 {
    class Solution {
        public String interpret(String command) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < command.length(); ++i) {
                if (command.charAt(i) == 'G') {
                    stringBuilder.append('G');
                } else if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                    stringBuilder.append('o');
                    ++i;
                } else {
                    stringBuilder.append("al");
                    i = i + 3;
                }
            }
            return stringBuilder.toString();
        }
    }
}
