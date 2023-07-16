package com.saltedfish.codinginterviews;

import java.util.ArrayList;
import java.util.List;

public class CI0057II {
    class Solution {
        public int[][] findContinuousSequence(int target) {
            int l = 1;
            int r = 2;
            List<List<Integer>> resList = new ArrayList<>();
            List<Integer> oneSeq = new ArrayList<>();
            while (l < r) {
                int num = (l + r) * (r - l + 1) / 2;
                if (num == target) {
                    oneSeq = new ArrayList<>();
                    for (int i = l; i <= r; ++i) {
                        oneSeq.add(i);
                    }
                    resList.add(oneSeq);
                    ++l;
                } else if (num < target) {
                    ++r;
                } else {
                    ++l;
                }
            }
            int [][] res = new int[resList.size()][];
            for (int i = 0; i < resList.size(); ++i) {
                res[i] = new int[resList.get(i).size()];
                for (int j = 0; j < resList.get(i).size(); ++j) {
                    res[i][j] = resList.get(i).get(j);
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        CI0057II.Solution solution = new CI0057II().new Solution();
        int [][] res = solution.findContinuousSequence(9);
        for (int i = 0; i < res.length; ++i) {
            for (int j = 0; j < res[i].length; ++j) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
