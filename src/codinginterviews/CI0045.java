package src.codinginterviews;

import java.util.Arrays;

public class CI0045 {
    class Solution {
        public String minNumber(int[] nums) {
            String[] str = new String[nums.length];

            for (int i = 0; i < nums.length; ++i) {
                str[i] = String.valueOf(nums[i]);
            }

            Arrays.sort(str, (x, y) -> (x + y).compareTo(y + x));
            StringBuilder res = new StringBuilder();
            for (String s : str) {
                res.append(s);
            }
            return res.toString();
        }
    }
}
