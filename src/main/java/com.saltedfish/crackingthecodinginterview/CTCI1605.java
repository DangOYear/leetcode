package com.saltedfish.crackingthecodinginterview;

/**
 * @author SaltedFish
 * @date 2021/6/2
 */
public class CTCI1605 {
    class Solution {
        public int trailingZeroes(int n) {
            int res = 0;
            while (n >= 5) {
                res += n / 5;
                n /= 5;
            }
            return res;
        }
    }
}
