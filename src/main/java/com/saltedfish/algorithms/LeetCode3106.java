package com.saltedfish.algorithms;

public class LeetCode3106 {
    class Solution {
        public String getSmallestString(String s, int k) {
            char[] arr = s.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                int dis = Math.min(arr[i] - 'a', 'z' - arr[i] + 1);
                if (dis <= k) {
                    arr[i] = 'a';
                    k -= dis;
                } else {
                    arr[i] -= k;
                    break;
                }

            }
            return new String(arr);
        }
    }
}
