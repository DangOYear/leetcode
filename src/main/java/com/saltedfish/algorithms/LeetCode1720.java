package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/2/11
 */
public class LeetCode1720 {
    class Solution {
        public int[] decode(int[] encoded, int first) {
            int[] res = new int[encoded.length + 1];
            res[0] = first;
            for (int i = 1; i < res.length; ++i) {
                first = first ^ encoded[i-1];
                res[i] = first;
            }
            return res;
        }
    }
}
