package src.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode1636 {
    class Solution {
        public int[] frequencySort(int[] nums) {
            Map<Integer, Integer> numCount = new HashMap<>();
            for (int num : nums) {
                numCount.put(num, numCount.getOrDefault(num, 0) + 1);
            }
            Integer[] numsInteger = Arrays.stream(nums).boxed().toArray(Integer[]::new);
            Arrays.sort(numsInteger, (a, b) -> numCount.get(a).equals(numCount.get(b)) ? b - a : numCount.get(a) - numCount.get(b));
            return Arrays.stream(numsInteger).mapToInt(Integer::valueOf).toArray();
        }
    }
}
