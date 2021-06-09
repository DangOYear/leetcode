package com.saltedfish.crackingthecodinginterview;

/**
 * @author SaltedFish
 * @date 2021/6/9
 */
public class CTCI0501 {
    class Solution {
        public int insertBits(int N, int M, int i, int j) {
            int leftMask = j == 31 ? 0 : ((~0) << (j+1));
            int rightMask = (1 << i) - 1;
            int mask = leftMask | rightMask;
            N &= mask;
            M <<= i;
            return N | M;
        }
    }
}
