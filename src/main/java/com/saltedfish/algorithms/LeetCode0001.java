package com.saltedfish.algorithms;

import java.util.*;




public class LeetCode0001 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];
            HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; i++) {
                if (m.containsKey(target - nums[i])) {
                    res[0] = m.get(target - nums[i]);
                    res[1] = i;
                }else {
                    m.put(nums[i], i);
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        LeetCode0001.Solution solution = new LeetCode0001().new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = solution.twoSum(nums, target);
        for (int x:res)
            System.out.println(x);
    }

}
