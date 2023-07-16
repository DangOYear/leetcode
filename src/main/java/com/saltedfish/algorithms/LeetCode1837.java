package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/5/3
 */
public class LeetCode1837 {
    class Solution {
        public int sumBase(int n, int k) {
            int res = 0;
            while (n > 0) {
                res += n % k;
                n /= k;
            }
            return res;
        }
    }
}
