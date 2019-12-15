package src.algorithms;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0728 {
    class Solution {
        public List<Integer> selfDividingNumbers(int left, int right) {
            List<Integer> res = new ArrayList<>();
            for (int i = left; i <= right; i++) {
                if (isSelfDividing(i))
                    res.add(i);
            }
            return res;
        }

        public boolean isSelfDividing(int num) {
            int N = num;
            while (N > 0) {
                int n = N % 10;
                N /= 10;
                if (n == 0 || num % n != 0)
                    return false;
            }
            return true;
        }

    }
}
