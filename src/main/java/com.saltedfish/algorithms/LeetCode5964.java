package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/12/26
 */
public class LeetCode5964 {

    class Solution {
        public int[] executeInstructions(int n, int[] startPos, String s) {
            int len = s.length();
            int[] res = new int[len];

            for (int i = 0; i < len; i++) {
                int startX = startPos[0];
                int startY = startPos[1];
                int count = 0;
                for (int j = i; j < len; ++j) {
                    switch (s.charAt(j)) {
                        case 'L':
                            startY--;
                            break;
                        case 'R':
                            startY++;
                            break;
                        case 'U':
                            startX--;
                            break;
                        case 'D':
                            startX++;
                            break;
                    }
                    if (startX < 0 || startY < 0 || startX >= n || startY >= n) {
                        break;
                    }
                    ++count;
                }
                res[i] = count;
            }
            return res;
        }
    }
}
