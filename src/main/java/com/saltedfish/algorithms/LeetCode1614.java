package com.saltedfish.algorithms;

import java.util.Stack;

public class LeetCode1614 {
    class Solution {
        public int maxDepth(String s) {
            Stack<Character> stack = new Stack<>();
            int count = 0;
            for (char ch : s.toCharArray()) {
                if (ch == '(') {
                    stack.push(ch);
                }
                if (ch == ')'){
                    stack.pop();
                }
                count = Math.max(count, stack.size());
            }
            return count;
        }
    }
}
