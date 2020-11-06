package src.crackingthecodinginterview;

public class CTCI0109 {
    class Solution {
        public boolean isFlipedString(String s1, String s2) {
            if (s1.length() != s2.length())
                return false;
            return (s2 + s2).indexOf(s1) != -1;
        }
    }
}
