package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/8/1
 */
public class LeetCode5830 {

    class Solution {
        public boolean isThree(int n) {
            int res = 0;
            int sqrt = (int)(Math.sqrt(n));
            for (int i = 1; i <= sqrt; i++) {
                if (i * i == n) {
                    res++;
                    continue;
                }

                if (n % i == 0) {
                    res += 2;
                    continue;
                }
            }
            return res == 3;
        }
    }

}
