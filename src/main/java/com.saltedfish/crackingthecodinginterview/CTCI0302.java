package com.saltedfish.crackingthecodinginterview;

import java.util.Stack;

/**
 * @author SaltedFish
 * @date 2021/6/3
 */
public class CTCI0302 {
    class MinStack {

        Stack<Integer> numStack;
        Stack<Integer> minStack;

        /** initialize your data structure here. */
        public MinStack() {
            numStack = new Stack<>();
            minStack = new Stack<>();
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int x) {
            numStack.push(x);
            minStack.push(Math.min(x, minStack.peek()));
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
