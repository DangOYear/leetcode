package src;

import java.util.HashSet;
import java.util.Set;
public class LeetCode0771 {
    class Solution {
        public int numJewelsInStones(String J, String S) {
            int count = 0;
            Set<Character> jewel = new HashSet<>();
            for(char c:J.toCharArray()) {
                jewel.add(c);
            }

            for (char c:S.toCharArray()) {
                if (jewel.contains(c))
                    ++count;
            }
            return count;
        }
    }

}
