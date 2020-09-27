package src.algorithms;

public class LCP0017 {
    class Solution {
        public int calculate(String s) {
            int x = 1;
            int y = 0;
            for (char ch : s.toCharArray()) {
                switch (ch) {
                    case 'A':
                        x = 2 * x + y;
                        break;
                    case 'B':
                        y = 2 * y + x;
                }
            }
            return x + y;
        }
    }
}
