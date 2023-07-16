package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2022/1/16
 */
public class LeetCode5980 {
    class Solution {
        public String[] divideString(String s, int k, char fill) {
            int len = s.length();
            int n;
            if (len % k == 0) {
                n = len / k;
            } else {
                n = len / k + 1;
            }
            String[] res = new String[n];
            StringBuilder sb = new StringBuilder();
            int count = 0;
            for (int i = 0; i < n * k; i++) {
                if (i < len) {
                    sb.append(s.charAt(i));
                } else {
                    sb.append(fill);
                }

                if (i % k == k - 1) {
                    res[count++] = sb.toString();
                    sb = new StringBuilder();
                }
            }
            return res;
        }
    }
}
