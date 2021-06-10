package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author SaltedFish
 * @date 2021/6/10
 */
public class LeetCode0721 {
    public class UnionFind {

        private int[] parent;

        public UnionFind(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            int fx = x;
            while (fx != parent[fx]) {
                fx = parent[fx];
            }
            parent[x] = fx;
            return fx;
        }

        public void unit(int x, int y) {
            int fx = find(x);
            int fy = find(y);

            if (fx == fy) {
                return;
            }
            parent[fy] = fx;
        }

    }

    class Solution {
        public List<List<String>> accountsMerge(List<List<String>> accounts) {
            Map<String, Integer> emailToIndex = new HashMap<>();
            Map<String, String> emailToUserName = new HashMap<>();
            int index = 0;
            for (List<String> account : accounts) {
                String userName = account.get(0);
                for (int i = 1; i < account.size(); i++) {
                    String email = account.get(i);
                    if (!emailToIndex.containsKey(email)) {
                        emailToIndex.put(email, index++);
                        emailToUserName.put(email, userName);
                    }
                }
            }
            UnionFind unionFind = new UnionFind(index);

            for (List<String> account : accounts) {
                String parentEmail = account.get(1);
                int parentIndex = emailToIndex.get(parentEmail);
                for (int i = 1; i < account.size(); i++) {
                    String email = account.get(i);
                    int emailIndex = emailToIndex.get(email);
                    unionFind.unit(parentIndex, emailIndex);
                }
            }

            Map<Integer, List<String>> parentIndexToEmails = new HashMap<>();
            for (String email : emailToIndex.keySet()) {
                int parentIndex = unionFind.find(emailToIndex.get(email));
                List<String> account = parentIndexToEmails.getOrDefault(parentIndex, new ArrayList<>());
                account.add(email);
                parentIndexToEmails.put(parentIndex, account);
            }

            List<List<String>> res = new ArrayList<>();
            for (List<String> emails : parentIndexToEmails.values()) {
                Collections.sort(emails);
                String userName = emailToUserName.get(emails.get(0));
                List<String> account = new ArrayList<>();
                account.add(userName);
                account.addAll(emails);
                res.add(account);
            }
            return res;
        }
    }
}
