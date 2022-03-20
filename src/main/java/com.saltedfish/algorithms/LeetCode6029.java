package com.saltedfish.algorithms;

import com.saltedfish.baseclass.OutputUtils;

/**
 * @author SaltedFish
 * @date 2022/3/20
 */
public class LeetCode6029 {
    class Solution {

        public int[] maximumBobPoints(int numArrows, int[] aliceArrows) {
            int len = aliceArrows.length;
            int[] neededArrow = new int[len];
            int[] value = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
            int[] res = new int[len];
            for (int i = 0; i < len; i++) {
                neededArrow[i] = aliceArrows[i] + 1;
            }
            int[][] dp = new int[len+1][numArrows+1];
            for (int i = 1; i <= len; i++) {
                for (int j = 1; j <= numArrows; j++) {
                    if (j - neededArrow[i-1] < 0) {
                        dp[i][j] = dp[i-1][j];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - neededArrow[i-1]] + value[i-1]);
                    }
                }
            }
            for(int i = len; i > 1; i--)
            {
                if(dp[i][numArrows] == dp[i-1][numArrows])
                    res[i-1] = 0;
                else {
                    res[i-1] = neededArrow[i-1];
                    numArrows -= neededArrow[i-1];
                }
            }
            res[0] = (numArrows > 0) ? numArrows : 0;

            return res;
        }
    }

    public static void main(String[] args) {
        LeetCode6029.Solution solution = new LeetCode6029().new Solution();
        int numArrows = 9;
        int[] aliceArrows = new int[]{1,1,0,1,0,0,2,1,0,1,2,0};
        OutputUtils.printIntArrary(solution.maximumBobPoints(numArrows, aliceArrows));
        numArrows = 89;
        aliceArrows = new int[]{3,2,28,1,7,1,16,7,3,13,3,5};
        OutputUtils.printIntArrary(solution.maximumBobPoints(numArrows, aliceArrows));


    }
}
