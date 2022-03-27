package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author SaltedFish
 * @date 2022/3/27
 */
public class LeetCode5268 {
    class Solution {
        public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            List<List<Integer>> res = new ArrayList<>();
            for (int x : nums1) {
                set1.add(x);
            }

            for (int x : nums2) {
                set2.add(x);
            }

            List<Integer> list1 = new ArrayList<>();
            for (int x : set1) {
                if (!set2.contains(x)) {
                    list1.add(x);
                }
            }

            List<Integer> list2 = new ArrayList<>();
            for (int x : set2) {
                if (!set1.contains(x)) {
                    list2.add(x);
                }
            }


            res.add(list1);
            res.add(list2);
            return res;
        }
    }
}
