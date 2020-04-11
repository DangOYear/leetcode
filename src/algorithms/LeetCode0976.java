package src.algorithms;

import java.util.Arrays;

public class LeetCode0976 {
    class Solution {
        public int largestPerimeter(int[] A) {
            int res = 0;
            Arrays.sort(A);
            for (int i = A.length - 3; i >= 0; --i) {
                if (A[i] + A[i+1] > A[i+2]) {
                    res = A[i] + A[i+1] + A[i+2];
                    break;
                }
            }
            return res;
        }
    }
}
