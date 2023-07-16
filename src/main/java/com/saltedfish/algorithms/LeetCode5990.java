package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author SaltedFish
 * @date 2022/1/23
 */
public class LeetCode5990 {
    class Solution {
        public List<Integer> findLonely(int[] nums) {
            Map<Integer, Integer> m = new HashMap<>();
            List<Integer> res = new ArrayList<>();
            for (int x : nums) {
                m.put(x,m.getOrDefault(x, 0)+1);
            }
            for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
                if (m.get(entry.getKey()) != 1) {
                    continue;
                }
                if (m.containsKey(entry.getKey()-1) || m.containsKey(entry.getKey()+1)) {
                    continue;
                }
                res.add(entry.getKey());
            }
            return res;
        }
    }
}
