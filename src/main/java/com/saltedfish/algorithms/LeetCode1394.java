package com.saltedfish.algorithms;

import java.util.HashMap;
import java.util.Map;

public class LeetCode1394 {
    class Solution {
        public int findLucky(int[] arr) {
            int res = -1;
            Map<Integer, Integer> cnt = new HashMap<>();
            for (int x : arr) {
                cnt.put(x, cnt.getOrDefault(x, 0) + 1);
            }

            for (int key : cnt.keySet()) {
                if (key == cnt.get(key))
                    res = key;
            }
            return res;
        }
    }
}
