package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0039 {
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> combination = new ArrayList<>();
            dfs(candidates, target, combination, res, 0);
            return res;
        }

        private void dfs(int[] candidates, int target, List<Integer> combination, List<List<Integer>> res, int index) {
            if (index == candidates.length) {
                return;
            }

            if (target == 0) {
                res.add(new ArrayList<>(combination));
                return;
            }

            dfs(candidates, target, combination, res, index + 1);

            if (target - candidates[index] >= 0) {
                combination.add(candidates[index]);
                dfs(candidates, target - candidates[index], combination, res, index);
                combination.remove(combination.size() - 1);
            }
        }
    }

}
