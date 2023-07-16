package com.saltedfish.algorithms;

import java.util.Stack;

public class LeetCode0844 {
    class Solution {
        public boolean backspaceCompare(String S, String T) {
            return operation(S).equals(operation(T));
        }

        public String operation(String str) {
            Stack<Character> stack = new Stack<>();
            for (char ch : str.toCharArray()) {
                if (ch != '#')
                    stack.push(ch);
                else {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                }
            }
            return String.valueOf(stack);
        }
    }
}
