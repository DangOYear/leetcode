package com.saltedfish.crackingthecodinginterview;

import java.util.ArrayList;
import java.util.List;

public class CTCI0809 {
    class Solution {

        private int num;
        private List<String> res;
        public List<String> generateParenthesis(int n) {
            res = new ArrayList<>();
            num = n;
            int left = 0;
            int right = 0;
            dfs(0, 0, "");
            return res;
        }

        public void dfs(int left, int right, String str) {
            if (left == num && left == right) {
                res.add(str);
                return;
            }
            if (left + 1 <= num) dfs(left + 1, right, str + "(");
            if (right + 1 <= left) dfs(left, right + 1, str + ")");
        }
    }
}
