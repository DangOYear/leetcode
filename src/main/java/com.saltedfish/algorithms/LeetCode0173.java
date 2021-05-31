package com.saltedfish.algorithms;

import com.saltedfish.baseclass.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SaltedFish
 * @date 2021/6/1
 */
public class LeetCode0173 {
    class BSTIterator {

        private int index;

        private List<Integer> data;

        public BSTIterator(TreeNode root) {
            index = 0;
            data = new ArrayList<>();
            inOrderTravel(root);
        }

        private void inOrderTravel(TreeNode node) {
            if (node != null) {
                inOrderTravel(node.left);
                data.add(node.val);
                inOrderTravel(node.right);
            }
        }


        public int next() {
            return data.get(index++);
        }

        public boolean hasNext() {
            return index < data.size();
        }
    }
}
