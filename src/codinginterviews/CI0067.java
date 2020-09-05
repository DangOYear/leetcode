package src.codinginterviews;

public class CI0067 {
    class Solution {
        public int strToInt(String str) {
            int i = 0;
            int sign = 1;
            int length = str.length();
            int res = 0;
            int bound = Integer.MAX_VALUE / 10;
            if (length == 0)    return 0;
            while (str.charAt(i) == ' ') {
                i++;
                if (i == length) {
                    return 0;
                }
            }
            if (str.charAt(i) == '-') sign = -1;
            if(str.charAt(i) == '-' || str.charAt(i) == '+') i++;
            while (i < length) {
                if (str.charAt(i) < '0' || str.charAt(i) > '9') break;
                if (res > bound || res == bound && str.charAt(i) > 7) {
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                res = res * 10 + (str.charAt(i) - '0');
                ++i;
            }
            return res * sign;
        }
    }
}
