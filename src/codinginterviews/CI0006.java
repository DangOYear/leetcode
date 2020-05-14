package src.codinginterviews;


/**
 * 面试题06. 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 *
 *
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 *
 *
 * 示例 1：
 *
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 *https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 *
 */


import src.algorithms.baseclass.ListNode;

import java.util.ArrayList;
import java.util.Stack;

public class CI0006 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public int[] reversePrint(ListNode head) {
            Stack<Integer> stack = new Stack<>();
            while (head != null) {
                stack.push(head.val);
                head = head.next;
            }

            int n = stack.size();
            int[] res = new int[n];
            for (int i = 0; i < n; ++i) {
                res[i] = stack.pop();
            }
            return res;
        }
    }



}
