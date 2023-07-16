package com.saltedfish.algorithms;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1287 {
    class Solution {
        public int findSpecialInteger(int[] arr) {
            int res = 0;
            Map<Integer, Integer> map = new HashMap<>();

            for (int x:arr) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }

            for (int x:map.keySet()) {
                if (map.get(x) >= arr.length / 4.0)
                    res = x;
            }
            return res;
        }
    }

}
