package com.saltedfish.algorithms;

import java.util.Stack;

public class LeetCode0071 {
    class Solution {
        public String simplifyPath(String path) {
            String[] str = path.split("/");
            Stack<String> stack = new Stack<>();

            for (String s : str) {
                if (s.equals("..")) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                }else if (!s.equals("") && !s.equals(".")) {
                    stack.push(s);
                }
            }

            if (stack.isEmpty()) {
                return "/";
            }

            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < stack.size(); ++i) {
                stringBuilder.append("/" + stack.get(i));
            }
            return stringBuilder.toString();
        }
    }
}
