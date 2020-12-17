package com.saltedfish.codinginterviews;


import src.algorithms.baseclass.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 剑指 Offer 37. 序列化二叉树
 *
 * 请实现两个函数，分别用来序列化和反序列化二叉树。
 *
 * 示例: 
 *
 * 你可以将以下二叉树：
 *
 *     1
 *    / \
 *   2   3
 *      / \
 *     4   5
 *
 * 序列化为 "[1,2,3,null,null,4,5]"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/xu-lie-hua-er-cha-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class CI0037 {
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
