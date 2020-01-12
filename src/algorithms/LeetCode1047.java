package src.algorithms;

import java.util.Stack;

public class LeetCode1047 {
    class Solution {
        public String removeDuplicates(String S) {
            Stack<Character> stack = new Stack<>();
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : S.toCharArray()) {
                if (!stack.empty() && c == stack.peek())
                    stack.pop();
                else
                    stack.push(c);
            }

            while (!stack.empty()) {
                stringBuilder = stringBuilder.append(stack.peek());
                stack.pop();
            }
            return stringBuilder.reverse().toString();
        }
    }
}
