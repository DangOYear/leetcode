package src.codinginterviews;


import java.util.HashSet;
import java.util.Set;

public class CI0003 {
    class Solution {
        public int findRepeatNumber(int[] nums) {
            Set<Integer> numSet = new HashSet<>();
            for (int x:nums) {
                if (numSet.contains(x))
                    return x;
                else
                    numSet.add(x);
            }
            return -1;
        }
    }
}
