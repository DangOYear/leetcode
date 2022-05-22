package com.saltedfish.algorithms;

import java.util.*;

public class LeetCode6076 {
    class Solution {

        boolean calculate(List<Integer> pointA, List<Integer> pointB, List<Integer> pointC) {
            return (pointB.get(1) - pointA.get(1)) * (pointC.get(0) - pointB.get(0)) == (pointC.get(1) - pointB.get(1)) * (pointB.get(0)-pointA.get(0));
        }

        public int minimumLines(int[][] stockPrices) {
            int len = stockPrices.length;
            if (len <= 2) {
                return len-1;
            }
            List<List<Integer>> stockPricesList = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                List<Integer> temp = new ArrayList<>();
                temp.add(stockPrices[i][0]);
                temp.add(stockPrices[i][1]);
                stockPricesList.add(temp);
            }
            Collections.sort(stockPricesList, Comparator.comparingInt(o -> o.get(0)));
            int count = 1;
            for (int i = 1; i < len-1; i++) {
                if (!calculate(stockPricesList.get(i-1), stockPricesList.get(i), stockPricesList.get(i+1))){
                    ++count;
                }

            }
            return count;
        }
    }

    public static void main(String[] args) {
        //int [][]stockPrices = new int[][]{{36,9},{17,93},{34,4},{30,11},{11,41},{53,36},{5,92},{81,92},{28,36},{3,45},{72,33},{64,1},{4,70},{16,73},{99,20},{49,33},{47,74},{83,91}};
        int [][]stockPrices = new int[][]{{72,98},{62,27},{32,7},{71,4},{25,19},{91,30},{52,73},{10,9},{99,71},{47,22},{19,30},{80,63},{18,15},{48,17},{77,16},{46,27},{66,87},{55,84},{65,38},{30,9},{50,42},{100,60},{75,73},{98,53},{22,80},{41,61},{37,47},{95,8},{51,81},{78,79},{57,95}};
        LeetCode6076.Solution solution = new LeetCode6076().new Solution();
        System.out.println(solution.minimumLines(stockPrices));
    }
}
