package src.algorithms;

public class LeetCode1323 {

    class Solution {
        public int maximum69Number (int num) {
            int pos = 0;
            int count = -1;
            int res = num;
            while (num > 0) {
                ++count;
                if (num % 10 == 6) {
                    pos = count;
                }
                num /= 10;
            }
            if (pos != 0)
                res += Math.pow(10, pos) * 3;
            return res;
        }
    }

    public static void main(String[] args) {

    }

}
