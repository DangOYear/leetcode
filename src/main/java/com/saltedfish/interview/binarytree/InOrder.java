package com.saltedfish.interview.binarytree;


import com.saltedfish.baseclass.TreeNode;

/**
 * 中序遍历
 *
 */
public class InOrder {
    /**
     * 递归遍历
     */
    public void inOrderRecursion(TreeNode node) {
        if (node != null) {
            inOrderRecursion(node.left);
            System.out.println(node.val);
            inOrderRecursion(node.right);
        }
    }
    /**
     * 非递归遍历
     */
    public void inOrderNonRecursion(TreeNode node) {

    }
}
