package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/17
 */
public class LeetCode0507 {
    class Solution {
        public boolean checkPerfectNumber(int num) {
            int res = 0;
            for (int i = 1; i <= (int)Math.sqrt(num); ++i) {
                if (num % i == 0) {
                    res += i;
                    res += num / i;
                }
            }
            res -= num;
            int sqrt = (int)Math.sqrt(num);
            res -= sqrt * sqrt == num ? sqrt : 0;
            return res == num;
        }
    }

    public static void main(String[] args) {
        LeetCode0507.Solution solution = new LeetCode0507().new Solution();
        System.out.println(solution.checkPerfectNumber(28));
        System.out.println(solution.checkPerfectNumber(6));
        System.out.println(solution.checkPerfectNumber(496));
        System.out.println(solution.checkPerfectNumber(8128));
        System.out.println(solution.checkPerfectNumber(2));
    }
}
