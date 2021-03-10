package com.saltedfish.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author SaltedFish
 * @date 2021/3/11
 */
public class LeetCode0560 {
    class Solution {
        public int subarraySum(int[] nums, int k) {
            int res = 0, prefixSum = 0;
            Map<Integer, Integer> kMap = new HashMap<>();
            kMap.put(0, 1);
            for (int i = 0; i < nums.length; i++) {
                prefixSum += nums[i];
                if (kMap.containsKey(prefixSum - k)) {
                    res += kMap.get(prefixSum - k);
                }
                kMap.put(prefixSum, kMap.getOrDefault(prefixSum, 0) + 1);
            }
            return res;
        }
    }
}
