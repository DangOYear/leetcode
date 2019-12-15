package src.algorithms;

public class LeetCode1252 {
    class Solution {
        public int oddCells(int n, int m, int[][] indices) {
            int []rows = new int[n];
            int []cols = new int[m];
            int res = 0;
            for (int i = 0 ; i < indices.length; i++) {
                rows[indices[i][0]] ^= 1;
                cols[indices[i][1]] ^= 1;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    res += rows[i] ^ cols[j];
                }
            }

            return res;
        }
    }


}
