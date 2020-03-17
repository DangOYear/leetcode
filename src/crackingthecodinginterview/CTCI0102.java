package src.crackingthecodinginterview;

import java.util.Arrays;
import java.util.Collections;

public class CTCI0102 {
    class Solution {
        public boolean CheckPermutation(String s1, String s2) {
            if (s1.length() != s2.length())
                return false;
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);
            s1 = String.valueOf(ch1);
            s2 = String.valueOf(ch2);
            return s1.equals(s2);


        }
    }
}
