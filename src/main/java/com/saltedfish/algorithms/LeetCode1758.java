package com.saltedfish.algorithms;


import java.util.HashMap;
import java.util.Map;

/**
 * @author SaltedFish
 * @date 2022/2/6
 */
public class LeetCode1758 {
    class Solution {
        public int sumOfUnique(int[] nums) {
            Map<Integer, Integer> count = new HashMap<>();
            for (int x : nums) {
                count.put(x, count.getOrDefault(x, 0)+1);
            }
            int res = 0;
            for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
                if (entry.getValue() == 1) {
                    res += entry.getKey();
                }
            }
            return res;
        }
    }
}
