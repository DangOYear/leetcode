package com.saltedfish.algorithms;

import java.util.Stack;

public class LeetCode6161 {
    class Solution {
        public String removeStars(String s) {
            Stack<Character> stack = new Stack<>();
            for (char ch : s.toCharArray()) {
                if (ch != '*') {
                    stack.push(ch);
                } else {
                    stack.pop();
                }
            }
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            return sb.reverse().toString();
        }
    }
}