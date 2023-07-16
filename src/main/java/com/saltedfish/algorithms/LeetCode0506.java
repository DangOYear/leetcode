package com.saltedfish.algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LeetCode0506 {
    class Solution {
        public String[] findRelativeRanks(int[] nums) {
            final int len = nums.length;
            Map<Integer, Integer> rankMap = new HashMap<>();
            int[] temp = nums.clone();
            Arrays.sort(temp);
            for (int i = 0; i < len; ++i) {
                rankMap.put(temp[i], i + 1);
            }
            String[] res = new String[len];
            for (int i = 0; i < len; ++i) {
                int index = rankMap.get(nums[i]);
                if (index == len) {
                    res[i] = "Gold Medal";
                } else {
                    if (index == len-1) {
                        res[i] = "Silver Medal";
                    } else {
                        if (index == len-2) {
                            res[i] = "Bronze Medal";
                        } else {
                            res[i] = String.valueOf(len-index+1);
                        }
                    }
                }
            }
            return res;
        }
    }
}
