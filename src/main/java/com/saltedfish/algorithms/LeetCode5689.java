package com.saltedfish.algorithms;

import java.util.List;

/**
 * @author SaltedFish
 * @date 2021/2/28
 */
public class LeetCode5689 {
    class Solution {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int index = -1;
            switch (ruleKey) {
                case "type" :
                    index = 0;
                    break;
                case "color" :
                    index = 1;
                    break;
                case "name" :
                    index = 2;
                    break;
                default:
                    break;
            }
            int finalIndex = index;
            return (int) items.stream()
                    .filter(x -> x.get(finalIndex).equals(ruleValue))
                    .count();

        }
    }
}
