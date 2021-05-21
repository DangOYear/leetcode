package com.saltedfish.crackingthecodinginterview;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SaltedFish
 * @date 2021/5/21
 */
public class CTCI0807 {
    class Solution {

        List<String> res = new ArrayList<>();

        private void swap(char[] chs, int i, int j) {
            char temp = chs[i];
            chs[i] = chs[j];
            chs[j] = temp;
        }

        private void backTracking(char[] chs, int index) {
            if (index == chs.length - 1) {
                res.add(String.valueOf(chs));
                return;
            }

            for (int i = index; i < chs.length; i++) {
                swap(chs, i, index);
                backTracking(chs, index + 1);
                swap(chs, i, index);
            }
        }

        public String[] permutation(String S) {
            backTracking(S.toCharArray(), 0);
            return res.toArray(new String[res.size()]);
        }
    }
}
