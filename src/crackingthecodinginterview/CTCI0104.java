package src.crackingthecodinginterview;

import java.util.HashMap;
import java.util.Map;

public class CTCI0104 {
    class Solution {
        public boolean canPermutePalindrome(String s) {
            Map<Character, Integer> map = new HashMap<>();
            for (char ch:s.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            int count = 0;

            for (char ch:map.keySet()) {
                if (map.get(ch) % 2 == 1)
                    count++;
            }
            if (count <= 1)
                return true;
            else
                return false;

        }
    }
}
