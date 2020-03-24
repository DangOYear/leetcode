package src.codinginterviews;

public class CI0015 {
    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int count = 0;
            while (n != 0) {
                ++count;
                n &= (n-1);
            }
            return count;
        }
    }
}
