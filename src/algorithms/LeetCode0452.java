package src.algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCode0452 {
    class Solution {
        public int findMinArrowShots(int[][] points) {
            if (points.length == 0) {
                return 0;
            }

            Arrays.sort(points, (o1, o2) -> {
                if (o1[1] > o2[1]) {
                    return 1;
                } else if (o1[1] < o2[1]) {
                    return -1;
                } else {
                    return 0;
                }
            });

            int pos = points[0][1];
            int ans = 1;
            for (int[] balloon: points) {
                if (balloon[0] > pos) {
                    pos = balloon[1];
                    ++ans;
                }
            }
            return ans;
        }

    }
}
