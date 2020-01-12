package src.algorithms;

import java.util.Stack;

public class LeetCode0917 {
    class Solution {
        public String reverseOnlyLetters(String S) {
            Stack<Character> stack = new Stack<>();

            for (char c : S.toCharArray()) {
                if (Character.isLetter(c))
                    stack.push(c);
            }

            StringBuilder stringBuilder = new StringBuilder();

            for (char c : S.toCharArray()) {
                if (Character.isLetter(c))
                    stringBuilder.append(stack.pop());
                else
                    stringBuilder.append(c);
            }
            return stringBuilder.toString();
        }
    }
}
