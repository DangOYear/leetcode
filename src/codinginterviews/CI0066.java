package src.codinginterviews;

public class CI0066 {
    class Solution {
        public int[] constructArr(int[] a) {
            if (a.length == 0)  return new int[0];
            int[] B = new int[a.length];
            B[0] = 1;
            int temp = 1;
            for (int i = 1; i < a.length; ++i) {
                B[i] = B[i-1] * a[i-1];
            }

            for (int i = a.length - 2; i >= 0; --i) {
                temp *= a[i+1];
                B[i] *= temp;
            }
            return B;
        }
    }
}
