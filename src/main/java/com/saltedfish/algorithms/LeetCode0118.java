package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0118 {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> res = new ArrayList<>();

            if (numRows == 0)
                return res;

            res.add(new ArrayList<>());
            res.get(0).add(1);

            for (int i = 1; i < numRows; ++i) {
                List<Integer> level = new ArrayList<>();
                List<Integer> preLevel = res.get(i-1);
                level.add(1);

                for (int j = 1; j < i; j++) {
                    level.add(preLevel.get(j-1) + preLevel.get(j));
                }

                level.add(1);
                res.add(level);
            }
            return res;
        }
    }
}
