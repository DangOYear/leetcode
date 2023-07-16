package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0412 {
    class Solution {
        public List<String> fizzBuzz(int n) {
            List<String> res = new ArrayList<>();
            for (int i = 1; i <= n; ++i) {
                boolean isDividedByThree = i % 3 == 0 ? true:false;
                boolean isDividedByFive = i % 5 == 0 ? true:false;

                if (isDividedByFive && isDividedByThree) {
                    res.add("FizzBuzz");
                    continue;
                }

                if (!isDividedByFive && ! isDividedByThree) {
                    res.add(String.valueOf(i));
                    continue;
                }

                if (isDividedByThree) {
                    res.add("Fizz");
                }

                if (isDividedByFive) {
                    res.add("Buzz");
                }
            }
            return res;
        }
    }
}
