package com.saltedfish.algorithms;

import java.util.Arrays;

public class LeetCode6160 {
    class Solution {
        public int[] answerQueries(int[] nums, int[] queries) {
            Arrays.sort(nums);
            int nLen = nums.length;
            int qLen = queries.length;
            int sum = 0;
            int[] res = new int[qLen];

            for (int i = 0; i < qLen; i++) {
                int temp = 0;
                for (int j = 0; j < nLen; j++) {
                    temp += nums[j];
                    if (temp > queries[i]) {
                        break;
                    } else {
                        res[i] = j+1;
                    }
                }
            }
            return res;
        }
    }
}
