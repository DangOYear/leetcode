package com.saltedfish.codinginterviews;

public class CI0065 {
    class Solution {
        public int add(int a, int b) {
            while (b != 0) {
                int c = (a & b) << 1;
                a ^= b;
                b = c;
            }
            return a;
        }
    }
}
