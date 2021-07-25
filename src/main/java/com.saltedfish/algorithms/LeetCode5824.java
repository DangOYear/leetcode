package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/7/25
 */
public class LeetCode5824 {
    class Solution {
        public String maximumNumber(String num, int[] change) {
            StringBuilder res = new StringBuilder();
            int lastIndex = -1;
            int i = 0;
            for (i = 0; i < num.length(); i++) {
                if (lastIndex != -1 && lastIndex != i - 1) {
                    break;
                }
                int temp = num.charAt(i) - '0';
                if (temp < change[temp] || (temp == change[temp] && lastIndex != -1)) {
                    res.append(change[temp]);
                    lastIndex = i;
                } else {
                    res.append(temp);
                }
            }
            res.append(num.substring(i));
            return res.toString();
        }
    }
}
