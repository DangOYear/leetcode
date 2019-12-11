package src;

public class LeetCode1189 {
    class Solution {
        public int maxNumberOfBalloons(String text) {
            int[] count = new int[5];
            int res = Integer.MAX_VALUE;

            for (char c:text.toCharArray()) {
                switch (c) {
                    case 'b':
                        count[0]++;
                        break;
                    case 'a':
                        count[1]++;
                        break;
                    case 'l':
                        count[2]++;
                        break;
                    case 'o':
                        count[3]++;
                        break;
                    case 'n':
                        count[4]++;
                        break;
                }
            }
            count[2] /= 2;
            count[3] /= 2;

            for (int i = 0; i < count.length; i++) {
                res = Math.min(res, count[i]);
            }
            return res;
        }
    }
}
