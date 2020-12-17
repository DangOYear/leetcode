package com.saltedfish.algorithms;


import com.saltedfish.baseclass.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1305 {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            List<Integer> res = new ArrayList<>();
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();

            inOrder(list1, root1);
            inOrder(list2, root2);
            int i = 0;
            int j = 0;
            while (i < list1.size() && j < list2.size()) {
                if (list1.get(i) < list2.get(j)) {
                    res.add(list1.get(i));
                    ++i;
                }else {
                    res.add(list2.get(j));
                    ++j;
                }
            }

            while (i < list1.size()) {
                res.add(list1.get(i));
                ++i;
            }

            while (j < list2.size()) {
                res.add(list2.get(j));
                ++j;
            }
            return res;
        }

        public void inOrder(List<Integer> list, TreeNode root) {
            if (root != null) {
                inOrder(list, root.left);
                list.add(root.val);
                inOrder(list, root.right);
            }
        }
    }


}
