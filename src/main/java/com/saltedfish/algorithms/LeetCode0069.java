package com.saltedfish.algorithms;

public class LeetCode0069 {
    class Solution {
        public int mySqrt(int x) {
            int l = 0;
            int r = x;
            int res = -1;

            while (l <= r) {
                int mid = l + (r - l) / 2;
                if ((long)mid * mid <= x) {
                    res = mid;
                    l = mid + 1;
                }else {
                    r = mid - 1;
                }
            }
            return res;
        }
    }
}
