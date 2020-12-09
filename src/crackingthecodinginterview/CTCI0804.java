package src.crackingthecodinginterview;

import java.util.ArrayList;
import java.util.List;

public class CTCI0804 {
    class Solution {
        List<List<Integer>> res;
        public List<List<Integer>> subsets(int[] nums) {
            res = new ArrayList<>();
            backtrack(new ArrayList<>(), nums, 0);
            return res;
        }

        public void backtrack(List<Integer> temp, int[] nums, int pos) {
            res.add(new ArrayList<>(temp));
            for (int i = pos; i < nums.length; ++i) {
                temp.add(nums[i]);
                backtrack(temp, nums, i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
