package src.algorithms;

public class LeetCode0487 {
    class Solution {
        public String licenseKeyFormatting(String S, int K) {
            S = S.replaceAll("-", "");
            StringBuilder stringBuilder = new StringBuilder();
            int count = 0;
            for (int i = S.length() - 1; i >= 0; --i) {
                ++count;
                stringBuilder.append(Character.toUpperCase(S.charAt(i)));
                if (count == K && i != 0) {
                    stringBuilder.append('-');
                    count = 0;
                }
            }
            return stringBuilder.reverse().toString();
        }
    }
}
