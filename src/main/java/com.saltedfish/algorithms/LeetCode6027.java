package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author SaltedFish
 * @date 2022/3/20
 */
public class LeetCode6027 {
    class Solution {
        public int countHillValley(int[] nums) {
            int res = 0;

            Map<Integer, Integer> map = new HashMap<>();
            List<Integer> numsL = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {

                if (i != 0 && nums[i] == nums[i-1]) {
                    continue;
                }
                numsL.add(nums[i]);
            }
            int left = 1;
            int right = numsL.size() - 1;
            for (int i = left; i < right; i++) {
                int leftNum = numsL.get(i-1);
                int rightNum = numsL.get(i+1);
                int now = numsL.get(i);
                if (leftNum > now && rightNum > now) {
                    res++;
                    continue;
                }
                if (leftNum < now && now > rightNum) {
                    res++;
                    continue;
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        LeetCode6027.Solution solution = new LeetCode6027().new Solution();
        int[] valley = new int[]{2,4,1,1,6,5};
        System.out.println(solution.countHillValley(valley));

    }
}
