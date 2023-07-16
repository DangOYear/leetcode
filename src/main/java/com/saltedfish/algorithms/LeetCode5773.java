package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/5/30
 */
public class LeetCode5773 {
    class Solution {
        public String maxValue(String n, int x) {
            StringBuilder sb = new StringBuilder();
            if (n.charAt(0) == '-') {

                for (int i = 1; i < n.length(); i++) {
                    if (n.charAt(i) - '0' > x) {
                        sb.append(n, 0, i).append(x).append(n.substring(i));
                        return sb.toString();
                    }
                }
            } else {
                for (int i = 0; i < n.length(); i++) {
                    if (n.charAt(i) - '0' < x) {
                        sb.append(n, 0, i).append(x).append(n.substring(i));
                        return sb.toString();
                    }
                }

            }

            return n + x;
        }
    }

    public static void main(String[] args) {
        LeetCode5773.Solution solution = new LeetCode5773().new Solution();
        String n = "962942516613939";

        int x = 3;

        System.out.println(solution.maxValue(n, x));

        n = "-648468153646";
        x = 5;
        System.out.println(solution.maxValue(n, x));
    }
}
