package src.algorithms;

public class LeetCode1558 {
    class Solution {
        public int numWaterBottles(int numBottles, int numExchange) {
            int res = numBottles;
            while (numBottles >= numExchange) {
                numBottles -= numExchange;
                ++res;
                ++numBottles;
            }
            return res;
        }
    }
}
