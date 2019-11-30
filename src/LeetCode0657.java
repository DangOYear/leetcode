package src;

public class LeetCode0657 {
    class Solution {
        public boolean judgeCircle(String moves) {
            int[] direct = new int[4];

            for (char move: moves.toCharArray()) {
                switch (move) {
                    case 'L':
                        direct[0]++;
                        break;
                    case 'R':
                        direct[1]++;
                        break;
                    case 'U':
                        direct[2]++;
                        break;
                    case 'D':
                        direct[3]++;
                        break;
                }
            }
            return direct[0] == direct[1] && direct[2] == direct[3];
        }
    }

}
