package src.algorithms;

public class LeetCode0008 {

    class Solution {
        public int myAtoi(String str) {
            //str = str.trim();
            int res = 0;
            boolean isNegative = false;


            for (int i = 0; i < str.length(); ++i) {
                if (str.charAt(i) == '-')
                    isNegative = true;
                if (isDigit(str.charAt(i))) {
                    res = res * 10 + str.charAt(i) - '0';
                }
            }

            return isNegative?-res:res;
        }

        public boolean isDigit(char ch) {
            if (ch <= '9' && ch >= '0')
                return true;
            return false;
        }
    }


}
