package src.algorithms;

public class LeetCode1304 {

    class Solution {
        public int[] sumZero(int n) {
            int[] res = new int[n];
            int num = n;
            for (int i = 0; i < n / 2; ++i) {
                res[i] = -num;
                res[n-1-i] = num;
                num -= 1;
            }
            if (n % 2 == 1)
                res[n/2+1] = 0;

            return res;
        }
    }
}
