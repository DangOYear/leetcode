package src.algorithms;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0078 {
    class Solution {

        List<List<Integer>> res;
        void backstrace(int pos,int count, ArrayList<Integer> cur, int[] nums) {
            if (cur.size() == count) {
                res.add(new ArrayList<>(cur));
                return;
            }
            for (int i = pos; i < nums.length; ++i) {
                cur.add(nums[i]);
                backstrace(i + 1, count, cur, nums);
                cur.remove(cur.size()-1);
            }
        }

        public List<List<Integer>> subsets(int[] nums) {
            res = new ArrayList<>();
            for (int i = 0; i < nums.length + 1; ++i) {
                backstrace(0, i, new ArrayList<Integer>(), nums);
            }
            return res;
        }
    }
}
