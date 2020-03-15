package src.algorithms;

public class LeetCode0283 {
class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                nums[left++] = nums[right];
            }
            ++right;
        } 
        
        while(left <right) {
             nums[left++]  = 0;
        }
    }
}
}
