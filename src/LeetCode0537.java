package src;

public class LeetCode0537 {
    class Solution {
        public String complexNumberMultiply(String a, String b) {
            String[] x = a.split("\\+|i");
            String[] y = b.split("\\+|i");

            int x_real = Integer.parseInt(x[0]);
            int x_frac = Integer.parseInt(x[1]);

            int y_real = Integer.parseInt(y[0]);
            int y_frac = Integer.parseInt(y[1]);

            return (x_real * y_real - x_frac * y_frac) + "+" + (x_frac * y_real - x_real * y_frac) + "i";
        }
    }
}
