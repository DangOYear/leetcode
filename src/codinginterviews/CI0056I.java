package src.codinginterviews;

public class CI0056I {
    class Solution {
        public int[] singleNumbers(int[] nums) {
            int sum = 0;
            int[] res = new int[2];
            for (int x : nums) {
                sum ^= x;
            }
            int div = 1;

            while ((div & sum) == 0) {
                div <<= 1;
            }
            for (int x : nums) {
                if ((div & x) == 0) {
                    res[0] ^= x;
                }else {
                    res[1] ^= x;
                }
            }
            return res;
        }
    }
}
