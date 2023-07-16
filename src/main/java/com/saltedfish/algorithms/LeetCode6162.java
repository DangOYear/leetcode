package com.saltedfish.algorithms;

public class LeetCode6162 {
    class Solution {
        public int garbageCollection(String[] garbage, int[] travel) {

            int res = 0;
            // M P G;
            int[] pos = new int[3];
            int gLen = garbage.length;
            int[] prefixSum = new int[gLen];
            for (int i = 0; i < gLen; i++) {
                if (i != 0) {
                    prefixSum[i] += prefixSum[i-1] + travel[i-1];
                }
                int sLen = garbage[i].length();
                for (int j = 0; j < sLen; j++) {
                    switch (garbage[i].charAt(j)) {
                        case 'M':
                            if (pos[0] != i) {
                                res += prefixSum[i] - prefixSum[pos[0]];
                            }
                            pos[0] = i;
                            res += 1;
                            break;
                        case 'P':
                            if (pos[1] != i) {
                                res += prefixSum[i] - prefixSum[pos[1]];
                            }
                            pos[1] = i;
                            res += 1;
                            break;
                        case 'G':
                            if (pos[2] != i) {
                                res += prefixSum[i] - prefixSum[pos[2]];
                            }
                            pos[2] = i;
                            res += 1;
                            break;
                    }
                }
            }

            return res;
        }
    }

    public static void main(String[] args) {
        String[] garbage = new String[]{"MMM","PGM","GP"};
        int[] travel = new int[]{3,10};
        LeetCode6162.Solution solution = new LeetCode6162().new Solution();
        System.out.println(solution.garbageCollection(garbage, travel));
    }

}
