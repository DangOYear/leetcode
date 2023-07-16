package com.saltedfish.algorithms;

/**
* @author SaltedFish
* @date 2021/12/26
*/

public class LeetCode5963 {
    class Solution {
        public boolean isSameAfterReversals(int num) {
            if (num == 0) {
                return true;
            }

            return num % 10 != 0;
        }
    }
}
