package src.algorithms;

import java.util.HashSet;
import java.util.Set;

public class LeetCode0929 {
    class Solution {
        public int numUniqueEmails(String[] emails) {
            Set<String> address = new HashSet<>();
            for (String email: emails) {
                int i = email.indexOf('@');
                String local = email.substring(0, i);
                String rest = email.substring(i);
                if (local.contains("+")) {
                    local = local.substring(0, local.indexOf('+'));
                }
                local = local.replaceAll("\\.", "");
                address.add(local + rest);
            }

            return address.size();
        }
    }
}
