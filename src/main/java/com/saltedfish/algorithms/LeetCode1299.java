package com.saltedfish.algorithms;

public class LeetCode1299 {
    class Solution {
        public int[] replaceElements(int[] arr) {
            int maxNum = arr[arr.length-1];
            for (int i = arr.length-1; i >= 0; --i) {
                int temp = arr[i];
                arr[i] = maxNum;
                if (temp > maxNum)
                    maxNum = temp;
            }
            arr[arr.length-1] = -1;
            return arr;
        }
    }
}
