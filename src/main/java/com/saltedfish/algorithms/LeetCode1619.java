package com.saltedfish.algorithms;

import java.util.Arrays;

public class LeetCode1619 {
    class Solution {
        public double trimMean(int[] arr) {
            double res = 0;
            Arrays.sort(arr);
            int start = (int)(arr.length * 0.05);
            for (int i = start; i < arr.length - start; ++i) {
                res += arr[i];
            }
            res = res / (arr.length - 2 * start);
            return res;
        }
    }
}
