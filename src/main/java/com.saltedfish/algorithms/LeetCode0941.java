package com.saltedfish.algorithms;

public class LeetCode0941 {
    class Solution {
        public boolean validMountainArray(int[] arr) {
            int N = arr.length;
            int pos = 0;
            while (pos + 1 < N && arr[pos] < arr[pos + 1]) {
                ++pos;
            }
            if (pos == 0 || pos == N - 1) {
                return false;
            }
            while (pos + 1 < N && arr[pos] > arr[pos + 1]) {
                ++pos;
            }
            return pos == N - 1;
        }
    }
}
