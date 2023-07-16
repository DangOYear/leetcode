package com.saltedfish.algorithms;

import java.util.LinkedList;
import java.util.List;




public class LeetCode1260 {
    class Solution {
        public List<List<Integer>> shiftGrid(int[][] grid, int k) {
            List<List<Integer>> res = new LinkedList<>();
            int row = grid.length;
            int col = row == 0 ? 0:grid[0].length;

            int posX = (k % (row * col)) / row;
            int posY = (k % (row * col)) % row;

            return res;

        }
    }

    public static void main(String[] args) {

    }

}
