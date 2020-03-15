package src.algorithms;

import java.util.*;




public class LeetCode0238 {
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int mul = 1;
        int []res = new int[nums.length];
        res[0] = 1;
        for (int i = 1; i < nums.length; ++i) {
             res[i] = nums[i-1] * res[i-1];
        }
        
        mul = 1;
        for (int i = nums.length-1; i >= 0; --i) {
            res[i] = res[i] * mul;
            mul *= nums[i];
        }
        return res;
    }
}
}
