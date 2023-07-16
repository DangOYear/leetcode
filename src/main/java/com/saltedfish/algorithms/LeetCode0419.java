package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/3/27
 */
public class LeetCode0419 {
    class Solution {
        public int countBattleships(char[][] board) {
            int res = 0;
            int row = board.length;
            int col = board[0].length;

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (board[i][j] == 'X' && (i == 0 || board[i-1][j] == '.') && (j == 0 || board[i][j-1] == '.')) {
                        ++res;
                    }
                }
            }
            return res;
        }
    }
}
