package com.saltedfish.algorithms;

import java.util.HashMap;
import java.util.Map;

public class LeetCode6248 {
    class Solution {
        public int countSubarrays(int[] nums, int k) {
            int len = nums.length;
            int[] diff = new int[len];

            int pos = -1;
            for (int i = 0; i < len; i++) {
                int num = nums[i];
                if (num < k) {
                    diff[i] = -1;
                } else {
                    if (num > k) {
                        diff[i] = 1;
                    } else {
                        pos = i;
                        diff[i] = 0;
                    }
                }
            }
            Map<Integer, Integer> afterMap = new HashMap<>();
            Map<Integer, Integer> beforeMap = new HashMap<>();
            int res = 1;

            int after = 0;
            for (int i = pos+1; i < len; i++) {
                after += diff[i];
                afterMap.put(after, afterMap.getOrDefault(after, 0)+1);
            }

            int before = 0;
            for (int i = pos-1; i >= 0; i--) {
                before += diff[i];
                beforeMap.put(before, beforeMap.getOrDefault(before, 0)+1);
            }

            res += beforeMap.getOrDefault(0, 0);
            res += beforeMap.getOrDefault(1, 0);
            res += afterMap.getOrDefault(0, 0);
            res += afterMap.getOrDefault(1, 0);

            for (Map.Entry<Integer, Integer> keyValue : afterMap.entrySet()) {
                res += beforeMap.getOrDefault(0-keyValue.getKey(), 0) * keyValue.getValue();
                res += beforeMap.getOrDefault(1-keyValue.getKey(), 0) * keyValue.getValue();
            }

            return res;

        }
    }

    public static void main(String[] args) {
        LeetCode6248.Solution solution = new LeetCode6248().new Solution();
        int[] nums = new int[]{3,2,1,4,5};
        int k = 4;
        System.out.println(solution.countSubarrays(nums, k));
    }
}
