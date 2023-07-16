package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2022/1/16
 */
public class LeetCode5194 {
    class Solution {
        public int minMoves(int target, int maxDoubles) {
            int res = 0;
            while (target != 1) {

                if (maxDoubles == 0) {
                    res += target - 1;
                    break;
                }

                if (target % 2 != 0 && maxDoubles != 0) {
                    res += target - (target / 2 * 2);
                    target = target / 2 * 2;
                    continue;
                }

                if (target % 2 == 0 && maxDoubles > 0) {
                    target /= 2;
                    ++res;
                    maxDoubles--;
                    continue;
                }

            }
            return res;
        }
    }
}
