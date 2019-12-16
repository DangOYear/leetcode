package src.algorithms;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LeetCode0697 {
    class Solution {
        public int findShortestSubArray(int[] nums) {
            Map<Integer, Integer> left = new HashMap<>();
            Map<Integer, Integer> right = new HashMap<>();
            Map<Integer, Integer> count = new HashMap<>();
            int res = nums.length;
            for (int i = 0; i < nums.length; ++i) {
                if (!left.containsKey(nums[i]))
                    left.put(nums[i], i);
                right.put(nums[i], i);
                count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            }

            int degree = Collections.max(count.values());

            for (int x:count.keySet()) {
                if (count.get(x) == degree) {
                    res = Math.min(right.get(x) - left.get(x) + 1, res);
                }
            }

            return res;
        }
    }
}
