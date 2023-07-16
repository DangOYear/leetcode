package com.saltedfish.algorithms;

import java.util.Arrays;

public class LeetCode1502 {
    class Solution {
        public boolean canMakeArithmeticProgression(int[] arr) {
            Arrays.sort(arr);
            for (int i = 1; i < arr.length - 1; ++i) {
                if (arr[i] - arr[i-1] != arr[i+1] - arr[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}
