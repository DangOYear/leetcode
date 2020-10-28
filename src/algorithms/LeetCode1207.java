package src.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode1207 {
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();
            Set<Integer> set = new HashSet<>();
            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for (Integer value : map.values()) {
                if (set.contains(value))
                    return false;
                set.add(value);
            }
            return true;
        }
    }
}


//Runtime: 2 ms, faster than 88.29% of Java online submissions for Unique Number of Occurrences.
//Memory Usage: 35.7 MB, less than 100.00% of Java online submissions for Unique Number of Occurrences.