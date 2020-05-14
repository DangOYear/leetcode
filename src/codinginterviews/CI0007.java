package src.codinginterviews;

import src.algorithms.baseclass.TreeNode;


/**
 * 面试题07. 重建二叉树
 *
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *
 *  
 *
 * 例如，给出
 *
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */

public class CI0007 {
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
        public TreeNode build(int[] preorder, int preL, int preR, int[] inorder, int inL, int inR) {
            if (preL > preR)
                return null;

            if (preL == preR) {
                return new TreeNode(preorder[preL]);
            }
            int i;
            TreeNode root = null;
            for (i = inL; i <= inR; ++i) {
                if (inorder[i] == preorder[preL]) {
                    root = new TreeNode(preorder[preL]);
                    break;
                }
            }
            root.left = build(preorder, preL + 1, i + preL - inL, inorder, inL, i - 1);
            root.right = build(preorder, preR - inR + i + 1, preR, inorder, i + 1, inR);
            return root;
        }

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            TreeNode root = build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
            return root;
        }
    }
}
