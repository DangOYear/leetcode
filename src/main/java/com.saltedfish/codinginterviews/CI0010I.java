package com.saltedfish.codinginterviews;


/**
 *
 *
 *
 */
public class CI0010I {

    class Solution {
        public int fib(int n) {
            if (n <= 1) {
                return n;
            }
            int f1 = 0;
            int f2 = 1;
            int fn = 0;
            for (int i = 2; i <= n; ++i) {
                fn = (f1 + f2) % 1000000007;
                f1 = f2;
                f2 = fn;
            }
            return fn % 1000000007;
        }


    }
}
