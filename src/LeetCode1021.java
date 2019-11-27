package src;

import java.util.Stack;

public class LeetCode1021 {
    class Solution {
        public String removeOuterParentheses(String S) {
            StringBuilder sb = new StringBuilder();
            int count = 0;
            int pre = 0;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == '(')
                    ++count;
                else {
                    --count;
                    if (count == 0) {
                        sb.append(S.substring(pre + 1, i));
                        pre = i + 1;
                    }
                }
            }
            return sb.toString();
        }
    }


}
