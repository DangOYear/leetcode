package com.saltedfish.algorithms;

import java.util.Arrays;

public class LeetCode0977 {
    class Solution {
        public int[] sortedSquares(int[] A) {
            int N = A.length;
            int[] res = new int[N];

            for (int i = 0; i < N; i++) {
                res[i] = A[i] * A[i];
            }
            Arrays.sort(res);
            return res;
        }
    }
}


//Runtime: 3 ms, faster than 33.47% of Java online submissions for Squares of a Sorted Array.
//Memory Usage: 41.1 MB, less than 95.73% of Java online submissions for Squares of a Sorted Array.