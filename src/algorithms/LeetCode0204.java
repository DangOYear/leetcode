package src.algorithms;

public class LeetCode0204 {

    class Solution {
        public int countPrimes(int n) {
            int count = 0;

            for (int i = 1; i < n; ++i) {
                if (isPrime(i))
                    ++count;
            }
            return count;
        }


        public boolean isPrime(int num) {
            if (num == 1)
                return false;
            if (num == 2)
                return true;
            for (int i = 2; i <= (int)Math.sqrt(num); ++i) {
                if (num % i == 0)
                    return false;
            }
            return true;
        }
    }


}
