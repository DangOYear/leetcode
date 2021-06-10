package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/6/10
 */
public class LeetCode0130 {
    class Solution {

        private int row;
        private int col;
        private char tempChar;

        public void dfs(char[][] board, int x, int y) {
            if (x < 0 || x >= row || y < 0 || y >= col || board[x][y] != 'O') {
                return;
            }
            board[x][y] = tempChar;
            int[][] direction = new int[][]{{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
            for (int i = 0; i < direction.length; i++) {
                dfs(board, x + direction[i][0], y + direction[i][1]);
            }

        }

        public void solve(char[][] board) {
            this.row = board.length;
            this.col = board[0].length;
            this.tempChar = '#';

            for (int i = 0; i < row; i++) {
                dfs(board, i, 0);
                dfs(board, i, col - 1);
            }

            for (int j = 0; j < col; j++) {
                dfs(board, 0, j);
                dfs(board, row - 1, j);
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (board[i][j] == tempChar) {
                        board[i][j] = 'O';
                    } else {
                        if (board[i][j] == 'O') {
                            board[i][j] = 'X';
                        }
                    }
                }
            }
        }
    }
}
