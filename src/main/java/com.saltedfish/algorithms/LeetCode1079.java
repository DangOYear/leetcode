package com.saltedfish.algorithms;


/**
 * @author SaltedFish
 * @date 2021/3/27
 */

public class LeetCode1079 {
    class Solution {

        private int cal(int a, int length) {
            int b = a + length - 1;
            int res = 1;
            for(int i = 0; i < a; i++){
                res *= b - i;
                res /= i + 1;
            }
            return res;
        }

        public int numTilePossibilities(String tiles) {
            int length = tiles.length();
            int res = 0;
            for (int i = 1; i <= length; i++) {
                res += cal(i, length);
            }
            return res;
        }
    }

    public static void main(String[] args) {
        LeetCode1079.Solution solution = new LeetCode1079().new Solution();
    }
}
