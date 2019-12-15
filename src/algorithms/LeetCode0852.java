package src.algorithms;

public class LeetCode0852 {
    class Solution {
        public int peakIndexInMountainArray(int[] A) {
            int N = A.length;
            int index;
            for (index = 1; index < N; ++index) {
                if (A[index] > A[index+1])
                    break;
            }
            return index;
        }
    }

}
