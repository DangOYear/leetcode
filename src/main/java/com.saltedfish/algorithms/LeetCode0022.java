package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0022 {
    class Solution {

        List<String> res;
        int num;

        public List<String> generateParenthesis(int n) {
            res = new ArrayList<>();
            num = n;
            int left = 0;
            int right = 0;
            backtrack(left, right, "");
            return res;
        }

        public void backtrack(int left, int right, String str) {
            if (left == num && left == right) {
                res.add(str);
            }
            if (left + 1 <= num) {
                backtrack(left + 1, right, str + '(');
            }
            if (right + 1 <= left) {
                backtrack(left, right + 1, str + ')');
            }
        }
    }

}
