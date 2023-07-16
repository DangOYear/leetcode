package com.saltedfish.algorithms;

public class LeetCode6133 {
    class Solution {
        int getMax(int left, int right, int n) {
            while (left < right) {
                int mid = (left + right) / 2;
                if ((mid)*(1+mid)/2 == n) {
                    return mid;
                }
                if ((mid)*(1+mid)/2 < n) {
                    left = mid;
                }

                if ((mid)*(1+mid)/2 > n) {
                    right = mid-1;
                }
            }
            return left+1;
        }

        public int maximumGroups(int[] grades) {
            int n = grades.length;
            return (int)(Math.log(n) / Math.log(2));
        }
    }

}
