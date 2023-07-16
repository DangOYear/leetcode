package com.saltedfish.interview.binarytree;


import com.saltedfish.baseclass.TreeNode;

/**
 * 前序遍历
 *
 */
public class PreOrder {

    /**
     * 递归遍历
     */
    public void preOrderRecursion(TreeNode node) {
        if (node != null) {
            System.out.println(node.val);
            preOrderRecursion(node.left);
            preOrderRecursion(node.right);
        }
    }

    /**
     * 非递归遍历
     */
    public void preOrderNonRecursion(TreeNode node) {

    }

}
