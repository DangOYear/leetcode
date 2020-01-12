package src.algorithms;

import java.util.HashSet;
import java.util.Set;

public class LeetCode0349 {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            for (int num1 : nums1) set1.add(num1);

            Set<Integer> set2 = new HashSet<>();
            for (int num2 : nums2) set2.add(num2);

            set1.retainAll(set2);

            int []res = new int[set1.size()];
            int index = 0;

            for (int x : set1) res[index++] = x;
            return res;
        }
    }
}
