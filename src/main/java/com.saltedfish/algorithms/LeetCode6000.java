package com.saltedfish.algorithms;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author SaltedFish
 * @date 2022/2/6
 */
public class LeetCode6000 {
    class Solution {
        public int[] sortEvenOdd(int[] nums) {
            List<Integer> even = new ArrayList<>();
            List<Integer> odd = new ArrayList<>();
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    odd.add(nums[i]);
                } else {
                    even.add(nums[i]);
                }
            }
            Collections.sort(even, Collections.reverseOrder());
            Collections.sort(odd);
            int[] res = new int[n];
            int i = 0;
            int i1 = 0;
            int i2 = 0;
            while (i < n) {
                if (i % 2 == 0) {
                    res[i++] = odd.get(i1++);
                } else {
                    res[i++] = even.get(i2++);
                }
            }
            return res;
        }
    }
}
