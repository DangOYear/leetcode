package src;

public class LeetCode1267 {
    class Solution {
        int row;
        int col;
        int count;
        int singleCount;


        public int countServers(int[][] grid) {
            row = grid.length;
            count = 0;
            col = row == 0 ? 0:grid[0].length;

            int rowCount[] = new int[row];
            int colCount[] = new int[col];


            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (grid[i][j] == 1) {
                        rowCount[i]++;
                        colCount[j]++;
                    }
                }
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (grid[i][j] == 1 && (rowCount[i] > 1 || colCount[j] > 1)) {
                        count++;
                    }
                }
            }
            return count;
        }

    }


}
