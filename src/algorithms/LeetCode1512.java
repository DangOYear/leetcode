package src.algorithms;


import java.util.HashMap;
import java.util.Map;

public class LeetCode1512 {
    class Solution {
        public int numIdenticalPairs(int[] nums) {
            Map<Integer, Integer> m = new HashMap<>();

            for (int num : nums) {
                m.put(num, m.getOrDefault(num, 0) + 1);
            }
            int res = 0;
            for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
                int value = entry.getValue();
                res += value * (value - 1) / 2;
            }
            return res;
        }
    }
}
