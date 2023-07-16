package com.saltedfish.algorithms;

public class LeetCode1009 {
    class Solution {
        public int bitwiseComplement(int N) {
            if (N == 0) {
                return 1;
            }
            int temp = N;
            while ((temp & (temp - 1)) > 0) {
                temp = temp & (temp - 1);
            }
            return ((temp << 1) - 1) ^ N;
        }
    }

    public static void main(String[] args) {
        LeetCode1009.Solution solution = new LeetCode1009().new Solution();
        System.out.println(solution.bitwiseComplement(7));
    }
}
