package src.algorithms;

public class LeetCode0868 {
    class Solution {
        public int binaryGap(int N) {
            String binary = Integer.toBinaryString(N);
            int last = 0;
            int countOne = 0;
            int res = 0;
            for (int i = 0; i < binary.length(); ++i) {

                if (binary.charAt(i) == '1') {
                    ++countOne;
                    res = Math.max(res, i - last);
                    last = i;
                }
            }

            if (countOne == 1)
                return 0;
            else
                return res;
        }
    }
}
