package src.algorithms;

import java.util.Arrays;

public class LeetCode1331 {
    class Solution {
        public int[] arrayRankTransform(int[] arr) {

            Arrays.sort(arr);
            int[] rank = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                if (i == 0)
                    rank[i] = 1;
                else {
                    if (arr[i] == arr[i-1]) {
                        rank[i] = rank[i-1];
                    }else {
                        rank[i] = i + 1;
                    }
                }
            }
            return rank;
        }
    }
}
