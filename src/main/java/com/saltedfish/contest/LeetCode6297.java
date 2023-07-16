package com.saltedfish.contest;


import java.util.*;

public class LeetCode6297 {
    class Solution {
        public int[][] sortTheStudents(int[][] score, int k) {
            List<List<Integer>> scoreList = new ArrayList<>();
            int row = score.length;
            int col = score[0].length;
            for (int i = 0; i < row; i++) {
                ArrayList temp = new ArrayList();
                for (int j = 0; j < col; j++) {
                    temp.add(score[i][j]);
                }
                scoreList.add(temp);
            }

            Collections.sort(scoreList, Comparator.comparingInt(o -> -o.get(k)));

            int[][] res = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    res[i][j] = scoreList.get(i).get(j);
                }
            }
            return res;
        }
    }
}
