package src.algorithms;

import java.util.Arrays;

public class LeetCode0322 {
    class Solution {
        public int coinChange(int[] coins, int amount) {
            Arrays.sort(coins);
            int res = 0;
            for (int i = coins.length - 1; i >= 0; --i) {
                if (amount == 0)
                    break;
                int num = amount / coins[i];
                res += num;
                amount = amount - num * coins[i];
            }

            if (amount != 0)
                return -1;
            else
                return res;
        }
    }
}
