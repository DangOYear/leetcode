package com.saltedfish.crackingthecodinginterview;

public class CTCI0101 {
    class Solution {
        public boolean isUnique(String astr) {
            //用二进制表示
            int num = 0;

            for (char ch:astr.toCharArray()) {
                if ((num & (1 << (ch - 'a'))) != 0) {
                    return false;
                }
                num |= (1 << (ch - 'a'));
            }
            return true;
        }
    }
}