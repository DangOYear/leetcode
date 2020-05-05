package src.algorithms;

public class LeetCode0008 {
    class Solution {
        public int myAtoi(String str) {
            int strLen = str.length();

            int index = 0;
            int res = 0;
            while (index < strLen) {
                if (str.charAt(index) != ' ')
                    break;
                index++;
            }

            if (index == strLen) {
                return 0;
            }
            int sign = 1;
            char firstChar = str.charAt(index);
            if (firstChar == '+') {
                index++;
                sign = 1;
            } else if (firstChar == '-') {
                index++;
                sign = -1;
            }
            while (index < strLen) {
                char curChar = str.charAt(index);

                if (curChar > '9' || curChar < '0'){
                    break;
                }
                 if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (curChar - '0') > Integer.MAX_VALUE % 10)) {
                    return Integer.MAX_VALUE;
                }
                if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (curChar - '0') > -(Integer.MIN_VALUE % 10))) {
                    return Integer.MIN_VALUE;
                }

                res = res * 10 + sign * (curChar - '0');
                index++;

            }



            return res;
        }
    }


}
