package src.algorithms;

import javafx.print.Collation;

import java.util.Collections;

public class LeetCode0190 {
    public class Solution {
        // you need treat n as an unsigned value
        public int reverseBits(int n) {
            int res = 0;
            int pow = 31;
            while (n != 0) {
                res += (n & 1) << pow ;
                n = n >>> 1;
                pow -= 1;
            }
            return res;
        }
    }
}
