package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/7/2
 */
public class LCS0001 {
    class Solution {
        public int leastMinutes(int n) {
            double exp = Math.log10(n) / Math.log10(2);
            int res = 0;
            if ((int)exp != exp) {
                res += 1;
            }
            return (int)exp + res + 1;
        }
    }

    public static void main(String[] args) {
        LCS0001.Solution solution = new LCS0001().new Solution();
        System.out.println(solution.leastMinutes(2));
        System.out.println(solution.leastMinutes(4));
        System.out.println(solution.leastMinutes(3));
    }
}
