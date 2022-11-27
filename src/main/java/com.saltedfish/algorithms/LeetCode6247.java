package com.saltedfish.algorithms;


import com.saltedfish.baseclass.ListNode;
import java.util.*;

/**
 * 给你一个正整数 n ，找出满足下述条件的 中枢整数 x ：
 *
 * 1 和 x 之间的所有元素之和等于 x 和 n 之间所有元素之和。
 * 返回中枢整数 x 。如果不存在中枢整数，则返回 -1 。题目保证对于给定的输入，至多存在一个中枢整数。
 */
public class LeetCode6247 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode removeNodes(ListNode head) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;

            List<Integer> l = new ArrayList<>();
            ListNode t = head;
            while (t != null) {
                l.add(t.val);
                t = t.next;
            }

            Stack<Integer> stack = new Stack<>();
            int[] mark = new int[l.size()];
            Arrays.fill(mark, -1);
            for (int i = 0; i < l.size(); i++) {

                while (!stack.isEmpty() && l.get(stack.peek()) < l.get(i)) {
                    mark[stack.peek()] = i;
                    stack.pop();
                }
                stack.push(i);
            }

            ListNode temp = dummy;
            for (int i = 0; i < mark.length; i++) {
                if (mark[i] == -1) {
                    temp = temp.next;
                } else {
                    temp.next = temp.next.next;
                }
            }

            return dummy.next;
        }
    }
}
