package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/12/19
 */
public class LeetCode5958 {
    class Solution {
        public long getDescentPeriods(int[] prices) {
            int len = prices.length;
            if (len <= 1) {
                return len;
            }
            long res = 0;
            int left = 0;
            int right = 1;
            long count = 1;
            while (right < len) {
                if (prices[right] == prices[left] - 1) {
                    ++count;
                } else {
                    res += (count + 1) * count / 2;
                    count = 1;
                }
                ++right;
                ++left;
            }
            res += (count + 1) * count / 2;
            return res;
        }
    }

    public static void main(String[] args) {
        LeetCode5958.Solution solution = new LeetCode5958().new Solution();
        int[] price = new int[]{12,11,10,9,8,7,6,5,4,3,4,3,10,9,8,7};
        System.out.println(solution.getDescentPeriods(price));

        price = new int[]{8, 6, 7, 7};
        System.out.println(solution.getDescentPeriods(price));

        price = new int[]{1};
        System.out.println(solution.getDescentPeriods(price));

    }
}
