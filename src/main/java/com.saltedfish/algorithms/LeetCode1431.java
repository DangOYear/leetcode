package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1431 {

    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int maxValue = Integer.MIN_VALUE;
            List<Boolean> res = new ArrayList<>();
            for (int i = 0; i < candies.length; ++i) {
                maxValue = Math.max(candies[i], maxValue);
            }

            for (int i = 0; i < candies.length; ++i) {
                if (candies[i] + extraCandies >= maxValue) {
                    res.add(Boolean.TRUE);
                }else {
                    res.add(Boolean.FALSE);
                }
            }
            return res;
        }
    }

}
