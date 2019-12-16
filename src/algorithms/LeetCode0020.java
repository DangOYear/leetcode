package src.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LeetCode0020 {
    class Solution {

        public boolean isValid(String s) {
            Map<Character, Character> map = new HashMap<>();
            map.put('}', '{');
            map.put(']', '[');
            map.put(')', '(');
            Stack<Character> stack = new Stack<>();

            for (char c:s.toCharArray()) {
                if (map.containsKey(c)) {
                    if (stack.empty())
                        return false;
                    if (map.get(c) != stack.peek())
                        return false;
                    stack.pop();
                }else {
                    stack.push(c);
                }

            }
            return stack.empty();
        }
    }

    public static void main(String[] args) {
        LeetCode0020.Solution solution = new LeetCode0020().new Solution();
        System.out.println(solution.isValid("([)]"));
    }
}
