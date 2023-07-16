package com.saltedfish.codinginterviewsii;

import sun.jvm.hotspot.oops.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SaltedFish
 * @date 2021/9/11
 */
public class CI0085 {
    class Solution {
        private List<String> res;
        private int n;

        private void dfs(String temp, int left, int right) {
            if (left == n && right == n) {
                res.add(temp);
            }

            if (left < n) {
                dfs(temp + '(',  left + 1, right);
            }

            if (left > right) {
                dfs(temp + ')', left, right + 1);
            }
        }

        public List<String> generateParenthesis(int n) {
            res = new ArrayList<>();
            this.n = n;
            dfs("", 0, 0);
            return res;
        }
    }
}
