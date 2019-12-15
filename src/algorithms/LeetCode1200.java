package src.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode1200 {
    class Solution {
        public List<List<Integer>> minimumAbsDifference(int[] arr) {
            List<List<Integer>> res = new ArrayList<>();
            int minDifference = Integer.MAX_VALUE;
            Arrays.sort(arr);

            for (int i = 1; i < arr.length; i++) {
                minDifference = Math.min(minDifference, arr[i] - arr[i-1]);
            }

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] - arr[i-1] == minDifference) {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i-1]);
                    list.add(arr[i]);
                    res.add(list);
                }
            }
            return res;
        }
    }
}
