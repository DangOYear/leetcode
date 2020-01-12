package src.algorithms;

public class LeetCode0476 {
    class Solution {
        public int findComplement(int num) {
            return ~num & Integer.toBinaryString(num).length();
        }
    }


    public static void main(String[] args) {

    }
}
