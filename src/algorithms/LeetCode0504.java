package src.algorithms;

public class LeetCode0504 {
    class Solution {
        public String convertToBase7(int num) {
            if (num == 0)
                return "0";
            StringBuilder stringBuilder = new StringBuilder();
            boolean flag = num >= 0 ? true : false;
            num = Math.abs(num);

            while (num > 0) {
                stringBuilder.append(num % 7);
                num /= 7;
            }
            if (flag) {
                return stringBuilder.reverse().toString();
            } else {
                return stringBuilder.append('-').reverse().toString();
            }
        }
    }

    public static void main(String[] args) {
        LeetCode0504.Solution solution = new LeetCode0504().new Solution();
        solution.convertToBase7(100);
    }
}
