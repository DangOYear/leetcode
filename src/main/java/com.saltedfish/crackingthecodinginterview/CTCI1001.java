package com.saltedfish.crackingthecodinginterview;

/**
 * @author SaltedFish
 * @date 2021/6/3
 */
public class CTCI1001 {
    class Solution {
        public void merge(int[] A, int m, int[] B, int n) {
            int curA = m - 1;
            int curB = n - 1;
            int tail = m + n - 1;
            int num;
            while (curA >= 0 || curB >= 0) {
                if (curA < 0) {
                    num = B[curB--];
                } else if (curB < 0) {
                    num = A[curA--];
                } else if (A[curA] > B[curB]) {
                    num = A[curA--];
                } else {
                    num = B[curB--];
                }
                A[tail--] = num;
            }
        }
    }
}
