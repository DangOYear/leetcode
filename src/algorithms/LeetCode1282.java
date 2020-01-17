package src.algorithms;

import java.util.*;

public class LeetCode1282 {
    class Solution {
        public List<List<Integer>> groupThePeople(int[] groupSizes) {
            List<List<Integer>> res = new ArrayList<>();
            Map<Integer, List<Integer>> map = new HashMap<>();

            for (int i = 0; i < groupSizes.length; i++) {
                if (map.containsKey(groupSizes[i])){
                    map.get(groupSizes[i]).add(i);
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    map.put(groupSizes[i], temp);
                }
            }

            for (Integer x:map.keySet()) {
                List<Integer> value = new ArrayList<>();
                for (int j = 0; j < map.get(x).size(); ++j) {

                    value.add(map.get(x).get(j));
                    if ((j + 1) % x == 0) {
                        res.add(value);
                        value = new ArrayList<>();
                    }
                }
            }

            return res;
        }
    }

    public static void main(String[] args) {
        LeetCode1282.Solution solution = new LeetCode1282().new Solution();
        int [] groupSizes = new int[]{3,3,3,3,3,1,3};
        List<List<Integer>> res = solution.groupThePeople(groupSizes);
        for (List<Integer> x:res) {
            for (Integer y:x) {
                System.out.print(y);
            }
            System.out.println();
        }

    }

}
