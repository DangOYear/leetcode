package src.algorithms;

import java.util.List;




public class LeetCode1260 {
    class Solution {
        public List<List<Integer>> shiftGrid(int[][] grid, int k) {
            List<List<Integer>> res = new List<List<Integer>>;
            int row = grid.length;
            int col = row == 0 ? 0:grid[0].length;

            int posX = (k % (row * col)) / row;
            int posY = (k % (row * col)) % row;

            for (int i = posX)
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [][]grid = {{1,2,3}, {4,5,6}, {7,8,9}};
    }

}
