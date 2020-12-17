package com.saltedfish.algorithms;

import src.algorithms.baseclass.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode0297 {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public class Codec {

        // Encodes a tree to a single string.
        public String serializeInner(TreeNode node, String str) {
            if (node == null) {
                str += "null,";
            } else {
                str += node.val + ",";
                str = serializeInner(node.left, str);
                str = serializeInner(node.right, str);
            }
            return str;
        }

        public String serialize(TreeNode root) {
            return serializeInner(root, "");
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] dataArray = data.split(",");
            List<String> dataList = new LinkedList<String>(Arrays.asList(dataArray));
            return deserializeInner(dataList);
        }

        public TreeNode deserializeInner(List<String> dataList) {
            if (dataList.get(0).equals("null")) {
                dataList.remove(0);
                return null;
            }

            TreeNode root = new TreeNode(Integer.valueOf(dataList.get(0)));
            dataList.remove(0);
            root.left = deserializeInner(dataList);
            root.right = deserializeInner(dataList);

            return root;
        }
    }

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
}
