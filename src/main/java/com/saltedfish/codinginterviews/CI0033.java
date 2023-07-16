package com.saltedfish.codinginterviews;

import java.util.Arrays;

public class CI0033 {
    class Solution {
        public boolean verifyPostorder(int[] postorder) {
            int length = postorder.length;
            if (length == 0) {
                return true;
            }

            int root = postorder[length - 1];

            int leftPoint = 0;

            while (leftPoint < length - 1) {
                if (postorder[leftPoint] > root) {
                    break;
                }
                ++leftPoint;
            }

            int rightPoint = leftPoint;
            while (rightPoint < length - 1) {
                if (postorder[rightPoint] < root) {
                    return false;
                }
                ++rightPoint;
            }

            boolean left = true;
            if (leftPoint > 0) {
                left = verifyPostorder(Arrays.copyOf(postorder, leftPoint));
            }

            boolean right = true;
            if (leftPoint < length - 1) {
                right = verifyPostorder(Arrays.copyOfRange(postorder, leftPoint, length - 1));
            }
            return left && right;
        }
    }
}
