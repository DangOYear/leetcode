package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/17
 */
public class LeetCode0441 {
    class Solution {

        private long calculate(long num) {
            return (1 + num) * num / 2;
        }

        public int arrangeCoins(int n) {
            long left = 1;
            long right = n;
            while (left <= right) {
                long mid = (left + right) / 2;
                if (calculate(mid) == n) {
                    return (int)mid;
                } else {
                    if (calculate(mid) < n) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
            return (int)right;
        }
    }

    public static void main(String[] args) {
        LeetCode0441.Solution solution = new LeetCode0441().new Solution();
        System.out.println(solution.arrangeCoins(2147483647));
    }
}
