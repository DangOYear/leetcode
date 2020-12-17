package com.saltedfish.algorithms;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode0912 {
    class Solution {
        public List<Integer> sortArray(int[] nums) {
            List<Integer> res = new ArrayList<>();
            Arrays.sort(nums);
            for (int num:nums) {
                res.add(num);
            }
            return res;
        }
    }
}
