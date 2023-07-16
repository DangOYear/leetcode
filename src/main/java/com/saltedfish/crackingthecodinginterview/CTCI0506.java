package com.saltedfish.crackingthecodinginterview;

public class CTCI0506 {
    class Solution {
        public int convertInteger(int A, int B) {
            return countOne(A ^ B);
        }

        public int countOne(int num) {
            int res = 0;
            while (num != 0) {
                num = num & (num - 1);
                ++res;
            }
            return res;
        }
    }
}
