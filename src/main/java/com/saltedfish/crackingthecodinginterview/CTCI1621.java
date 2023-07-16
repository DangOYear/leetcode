package com.saltedfish.crackingthecodinginterview;

import java.util.Arrays;

/**
 * @author SaltedFish
 * @date 2021/6/7
 */
public class CTCI1621 {
    class Solution {
        public int[] findSwapValues(int[] array1, int[] array2) {

            int sum1 = 0;
            for (int num : array1) {
                sum1 += num;
            }

            int sum2 = 0;
            for (int num : array2) {
                sum2 += num;
            }

            int d = sum1 - sum2;

            Arrays.sort(array1);
            Arrays.sort(array2);

            int i = 0;
            int j = 0;

            while (i < array1.length && j < array2.length) {
                int diff = (array1[i] - array2[j]) * 2;
                if (diff == d) {
                    return new int[]{array1[i], array2[j]};
                } else {
                    if (diff > d) {
                        j++;
                    } else {
                        i++;
                    }
                }
            }
            return new int[]{};
        }
    }
}
