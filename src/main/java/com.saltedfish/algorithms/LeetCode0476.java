package com.saltedfish.algorithms;

public class LeetCode0476 {
    class Solution {
        public int findComplement(int num) {
            int temp = num;
            while ((temp & (temp - 1)) > 0) {
                temp = temp & (temp - 1);
            }
            return ((temp << 1) - 1) ^ num;
        }
    }


    public static void main(String[] args) {
        LeetCode0476.Solution solution = new LeetCode0476().new Solution();
        System.out.println(solution.findComplement(1));
        System.out.println(solution.findComplement(5));
        System.out.println(solution.findComplement(2147483647));

    }
}
