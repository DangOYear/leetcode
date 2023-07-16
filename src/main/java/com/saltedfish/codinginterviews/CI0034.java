package com.saltedfish.codinginterviews;


import com.saltedfish.baseclass.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * 面试题34. 二叉树中和为某一值的路径
 * 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
 *
 *  
 *
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \    / \
 *         7    2  5   1
 * 返回:
 *
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */

public class CI0034 {
    class Solution {
        private List<List<Integer>> res;
        private int target;

        public List<List<Integer>> pathSum(TreeNode root, int sum) {
            res = new LinkedList<>();
            List<Integer> onePath= new LinkedList<>();
            target = sum;
            dfs(root, 0, onePath);
            return res;
        }

        public void dfs(TreeNode node, int count, List<Integer> onePath) {
            if (node == null) {
                return;
            }
            count += node.val;
            onePath.add(node.val);
            if (count == target && node.left == null && node.right == null) {
                res.add(new LinkedList<>(onePath));
                onePath.remove(onePath.size() - 1);
                return;
            }
            dfs(node.left, count, onePath);
            dfs(node.right, count, onePath);
            onePath.remove(onePath.size() - 1);
        }
    }

    public static void main(String[] args) {
        CI0034.Solution solution = new CI0034().new Solution();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        solution.pathSum(root, 22);
    }
}
