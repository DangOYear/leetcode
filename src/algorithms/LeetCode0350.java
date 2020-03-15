package src.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode0350 {
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            if (nums1.length > nums2.length)
                return intersect(nums2, nums1);

            Map<Integer, Integer> count = new HashMap<>();

            for (int x:nums1) {
                count.put(x, count.getOrDefault(x, 0) + 1);
            }
            int pos = 0;
            for (int x:nums2) {
                if (count.getOrDefault(x, 0) >= 1) {
                    nums1[pos++] = x;
                    count.put(x, count.get(x) - 1);
                }
            }


            return Arrays.copyOfRange(nums1, 0, pos);
        }
    }
}
