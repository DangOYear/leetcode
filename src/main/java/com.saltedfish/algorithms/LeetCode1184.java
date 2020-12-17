package com.saltedfish.algorithms;

public class LeetCode1184 {
    class Solution {
        public int distanceBetweenBusStops(int[] distance, int start, int destination) {
            int path = 0;
            int sdpath = 0;
            for (int x:distance) {
                path += x;
            }

            while (start != destination) {
                sdpath += distance[start];
                ++start;
                start %= distance.length;
            }

            return Math.min(sdpath, path-sdpath);
        }
    }
}
