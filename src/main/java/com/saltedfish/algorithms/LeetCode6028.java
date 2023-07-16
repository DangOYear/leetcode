package com.saltedfish.algorithms;

import java.util.Stack;

/**
 * @author SaltedFish
 * @date 2022/3/20
 */
public class LeetCode6028 {
    class Solution {
        public int countCollisions(String directions) {
            Stack<Character> stack = new Stack<>();
            int res = 0;
            for (char ch : directions.toCharArray()) {
                if (stack.size() == 0 && ch == 'L') {
                    continue;
                }
                if (stack.size() == 0) {
                    stack.push(ch);
                    continue;
                }
                char left = stack.peek();
                char right = ch;
                if (left == 'R' && right == 'L') {
                    res += 2;
                    stack.pop();
                    while (stack.size() != 0 && stack.peek() == 'R') {
                        res += 1;
                        stack.pop();
                    }
                    stack.push('S');
                    continue;
                }

                if (left == 'R' && right == 'S') {
                    res += 1;
                    stack.pop();
                    while (stack.size() != 0 && stack.peek() == 'R') {
                        res += 1;
                        stack.pop();
                    }
                    stack.push('S');
                    continue;
                }

                if (left == 'S' && right == 'L') {
                    res += 1;
                    stack.pop();
                    stack.push('S');
                    continue;
                }
                stack.push(ch);
            }

            return res;
        }
    }

    public static void main(String[] args) {
        LeetCode6028.Solution solution = new LeetCode6028().new Solution();
        // 24
        System.out.println(solution.countCollisions("LSSSLLSSSSLRRSLLLSLSLRRLLLLLRSSRSRRSLLLSSS"));
    }
}
