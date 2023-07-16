package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SaltedFish
 * @date 2021/5/21
 */
public class LeetCode1409 {
    class Solution {
        public int[] processQueries(int[] queries, int m) {
            List<Integer> permutation = new ArrayList<>();
            for (int i = 1; i <= m; i++) {
                permutation.add(i);
            }

            int[] res = new int[queries.length];
            for (int i = 0; i < queries.length; i++) {
                int pos = -1;
                for (int j = 0; j < m; j++) {
                    if (permutation.get(j) == queries[i]) {
                        pos = j;
                        break;
                    }
                }
                res[i] = pos;
                permutation.remove(pos);
                permutation.add(0, queries[i]);
            }
            return res;
        }
    }
    
}
