package com.saltedfish.crackingthecodinginterview;

/**
 * @author SaltedFish
 * @date 2021/6/4
 */
public class CTCI0502 {
    class Solution {
        public String printBin(double num) {
            StringBuilder res = new StringBuilder("0.");
            while (num != 0) {
                num *= 2;
                if (num >= 1) {
                    res.append("1");
                    num -= 1;
                } else {
                    res.append("0");
                }
                if (res.length() > 32) {
                    return "ERROR";
                }
            }
            return res.toString();
        }
    }
}
