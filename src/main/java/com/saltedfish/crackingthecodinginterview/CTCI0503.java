package com.saltedfish.crackingthecodinginterview;

import java.util.Arrays;

/**
 * @author SaltedFish
 * @date 2021/6/4
 */
public class CTCI0503 {
    class Solution {
        public int reverseBits(int num) {
            //补位
            String binaryString = Integer.toBinaryString(num);
            if (binaryString.length() < 32) {
                char[] fill = new char[32 - binaryString.length()];
                Arrays.fill(fill, '0');
                binaryString = new String(fill) + binaryString;
            }

            int res = 0;
            int count = 0;
            int lastZeroIndex = -1;
            for (int i = 0; i < binaryString.length(); i++) {
                if (binaryString.charAt(i) == '0') {
                    count = i - lastZeroIndex;
                    lastZeroIndex = i;
                    res = Math.max(res, count);
                } else {
                    ++count;
                    res = Math.max(res, count);
                }
            }
            return res;
        }
    }

}
