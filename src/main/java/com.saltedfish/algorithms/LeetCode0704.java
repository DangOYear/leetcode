package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode0704 {
    class Solution {
        public int search(int[] nums, int target) {
            int index = Arrays.binarySearch(nums, target);
            return index >= 0 ? index : -1;
        }
    }
}
