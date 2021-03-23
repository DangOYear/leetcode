package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SaltedFish
 * @date 2021/3/23
 */
public class LeetCode0077 {
    class Solution {

        private void dfs(List<List<Integer>> res, List<Integer> combination, int pos, int n, int k) {
            if (combination.size() + n - pos + 1 < k) {
                return;
            }

            if (combination.size() == k) {
                res.add(new ArrayList<>(combination));
                return;
            }

            combination.add(pos);
            dfs(res, combination, pos + 1, n, k);
            combination.remove(combination.size() - 1);
            dfs(res, combination, pos + 1, n, k);
        }

        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> res = new ArrayList<>();
            dfs(res, new ArrayList<>(), 1, n, k);
            return res;
        }
    }
}
