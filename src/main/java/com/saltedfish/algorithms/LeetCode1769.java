package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/2/24
 */
public class LeetCode1769 {
    class Solution {
        public int[] minOperations(String boxes) {
            int[] res = new int[boxes.length()];
            int left = 0, right = 0, total = 0;
            if (boxes.charAt(0) == '1') {
                ++left;
            }
            for (int i = 1; i < boxes.length(); ++i) {
                if (boxes.charAt(i) == '1') {
                    ++right;
                    total += i;
                }
            }
            res[0] = total;
            for (int i = 1; i < boxes.length(); i++) {
                total = total + left - right;
                if (boxes.charAt(i) == '1') {
                    left++;
                    right--;
                }
                res[i] = total;
            }
            return res;
        }
    }
}




