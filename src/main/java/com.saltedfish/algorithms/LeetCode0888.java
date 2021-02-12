package com.saltedfish.algorithms;

import com.saltedfish.baseclass.InputUtils;
import com.saltedfish.baseclass.OutputUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author SaltedFish
 * @date 2021/2/12
 */
public class LeetCode0888 {
    class Solution {
        public int[] fairCandySwap(int[] A, int[] B) {
            int sumA = Arrays.stream(A).sum();
            int sumB = Arrays.stream(B).sum();
            int delta = sumA - sumB;
            Set<Integer> candySet = new HashSet<>();
            for (int num : A) {
                candySet.add(num);
            }
            int[] res = new int[2];
            for (int y : B) {
                int x = 2 * y + delta;
                if (x % 2 == 1) {
                    continue;
                }
                if (candySet.contains(x / 2)) {
                    res[0] = x / 2;
                    res[1] = y;
                    break;
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        LeetCode0888.Solution solution = new LeetCode0888().new Solution();
        OutputUtils.printIntArrary(solution.fairCandySwap(InputUtils.parseStringToNumsArray("[1,1]"),
                InputUtils.parseStringToNumsArray("[2,2]")));
    }
}
