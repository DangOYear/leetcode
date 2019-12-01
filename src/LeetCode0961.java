package src;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode0961 {
    class Solution {
        public int repeatedNTimes(int[] A) {
            int res = -1;
            Map<Integer, Integer> map = new HashMap<>();

            for (int num: A) {
                map.put(num, map.getOrDefault(num, 0) + 1);
                if (map.get(num) > 1){
                    res = num;
                    break;
                }
            }

            return res;
        }
    }
}


