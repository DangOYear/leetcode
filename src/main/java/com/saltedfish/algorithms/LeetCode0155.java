package com.saltedfish.algorithms;

import java.util.Stack;

/**
 * @author SaltedFish
 * @date 2021/3/7
 */
public class LeetCode0155 {
    class MinStack {
        Stack<Integer> minStack;
        Stack<Integer> numStack;
        /** initialize your data structure here. */
        public MinStack() {
            minStack = new Stack<>();
            numStack = new Stack<>();
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int x) {
            numStack.push(x);
            minStack.push(Math.min(minStack.peek(), x));
        }

        public void pop() {
            numStack.pop();
            minStack.pop();
        }

        public int top() {
            return numStack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

}
