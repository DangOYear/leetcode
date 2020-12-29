package com.saltedfish.crackingthecodinginterview;

public class CTCI0507 {
    class Solution {
        public int exchangeBits(int num) {
            return  ((num & 0x55555555) << 1) | ((num & 0xaaaaaaaa) >>> 1);
        }
    }
}
