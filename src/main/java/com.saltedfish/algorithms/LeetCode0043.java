package com.saltedfish.algorithms;

public class LeetCode0043 {
    class Solution {
        public String multiply(String num1, String num2) {
            if (num1.equals("0") || num2.equals("0"))
                return "0";

            String res = "0";

            for (int i = num2.length() - 1; i >= 0; --i) {
                int carry = 0;
                StringBuilder mul = new StringBuilder();

                for (int j = 0; j < num2.length() - 1 - i; ++j) {
                    mul.append(0);
                }
                int n2 = num2.charAt(i) - '0';


                for (int j = num1.length() - 1; j >= 0 || carry != 0; --j) {
                    int n1 = j >= 0 ? num1.charAt(j) - '0' : 0;
                    int temp = n1 * n2 + carry;
                    mul.append(temp % 10);
                    carry = temp / 10;

                }
                res = addStrings(res, mul.reverse().toString());
            }
            return res;
        }


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
