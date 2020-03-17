package src.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode0811 {
    class Solution {
        public List<String> subdomainVisits(String[] cpdomains) {
            Map<String, Integer> visitCount = new HashMap<>();
            List<String> res = new ArrayList<>();

            for (String str : cpdomains) {
                String[] cpinfo = str.split(" ");

            }
            return res;
        }
    }

    public static void main(String[] args) {
        LeetCode0811.Solution solution = new LeetCode0811().new Solution();

        String[] cpdomains = new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};

        for (String string:solution.subdomainVisits(cpdomains)) {
            System.out.print(string);
        }
    }
}

//
//          Example 1:
//        Input:
//        ["9001 discuss.leetcode.com"]
//        Output:
//        ["9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"]