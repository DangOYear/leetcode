package com.saltedfish.algorithms;

public class LeetCode0845 {
    class Solution {
        public int longestMountain(int[] A) {
            int n = A.length;
            int res = 0;
            int left = 0;
            while (left + 2 < n) {
                int right = left + 1;
                if (A[left] < A[left + 1]) {
                    while (right + 1 < n && A[right] < A[right + 1]) {
                        ++right;
                    }
                    if (right + 1 < n && A[right] > A[right + 1]) {
                        while (right + 1 < n && A[right] > A[right + 1]) {
                            ++right;
                        }
                        res = Math.max(res, right - left + 1);
                    } else {
                        ++right;
                    }
                }
                left = right;
            }
            return res;
        }
    }
}
