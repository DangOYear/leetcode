package src.algorithms;

public class LeetCode0415 {
    class Solution {
        public String addStrings(String num1, String num2) {
            StringBuilder stringBuilder = new StringBuilder();
            int i = num1.length() - 1;
            int j = num2.length() - 1;
            int carry = 0;
            while (i >= 0 || j >= 0) {
                int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
                int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
                int temp = n1 + n2 + carry;
                carry = temp / 10;
                stringBuilder.append(temp % 10);
                i--;
                j--;
            }
            if (carry != 0) stringBuilder.append(1);
            return stringBuilder.reverse().toString();
        }
    }
}
