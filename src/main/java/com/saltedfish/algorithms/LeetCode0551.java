package com.saltedfish.algorithms;

public class LeetCode0551 {
    class Solution {
        public boolean checkRecord(String s) {
            char[] chs = s.toCharArray();
            int countA = 0;
            int countL = 0;
            for (char ch : chs) {
                switch (ch) {
                    case 'A':
                        countL = 0;
                        countA++;
                        if (countA >= 2) {
                            return false;
                        }
                        break;
                    case 'L':
                        countL++;
                        if (countL >= 3) {
                            return false;
                        }
                        break;
                    default:
                        countL = 0;
                        break;
                }
            }
            return countA < 2 && countL < 3;
        }
    }

    public static void main(String[] args) {
        LeetCode0551.Solution solution = new LeetCode0551().new Solution();
        solution.checkRecord("PPALLL");
    }

}
