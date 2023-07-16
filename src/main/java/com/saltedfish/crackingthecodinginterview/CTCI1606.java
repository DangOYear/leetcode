package com.saltedfish.crackingthecodinginterview;

import java.util.Arrays;

/**
 * @author SaltedFish
 * @date 2021/6/4
 */
public class CTCI1606 {
    class Solution {
        public int smallestDifference(int[] a, int[] b) {
            Arrays.sort(a);
            Arrays.sort(b);

            int posA = 0;
            int posB = 0;

            long res = Long.MAX_VALUE;

            while (posA < a.length && posB < b.length) {
                if (a[posA] == b[posB]) {
                    return 0;
                } else {
                    if (a[posA] > b[posB]) {
                        res = Math.min(res, (long)a[posA] - (long)b[posB]);
                        ++posB;
                    } else {
                        res = Math.min(res, (long)b[posB] - (long)a[posA]);
                        ++posA;
                    }
                }
            }
            return (int)res;
        }
    }
}
