package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/17
 */
public class LeetCode1539 {
    class Solution {
        public int findKthPositive(int[] arr, int k) {
            int res = -1;
            int missCount = 0;
            int cur = 1;
            int pos = 0;
            for (missCount = 0; missCount < k; cur++) {
                if (cur == arr[pos]) {
                    pos = (pos + 1 < arr.length) ? pos + 1 : pos;
                } else {
                    ++missCount;
                    res = cur;
                }
            }
            return res;
        }
    }
}
