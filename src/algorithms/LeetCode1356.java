package src.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LeetCode1356 {
    class Solution {
        public int getCountOne(int num) {
            int count = 0;
            while (num != 0) {
                num = num & (num - 1);
                ++count;
            }
            return count;
        }

        public int[] sortByBits(int[] arr) {
            List<Integer> list = new ArrayList<>();
            int[] bit = new int[10010];
            for (int x : arr) {
                list.add(x);
                bit[x] = getCountOne(x);
            }
            Collections.sort(list, new Comparator<Integer>() {
                @Override
                public int compare(Integer x, Integer y) {
                    if (bit[x] != bit[y]) {
                        return bit[x] - bit[y];
                    } else {
                        return x - y;
                    }
                }
            });
            for (int i = 0; i < arr.length; ++i) {
                arr[i] = list.get(i);
            }
            return arr;
        }
    }


}
