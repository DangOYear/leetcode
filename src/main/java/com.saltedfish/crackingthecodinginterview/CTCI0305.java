package com.saltedfish.crackingthecodinginterview;

import java.util.Stack;

/**
 * @author SaltedFish
 * @date 2021/6/3
 */
public class CTCI0305 {
    class MyQueue {

        Stack<Integer> pushStack;
        Stack<Integer> popStack;

        /** Initialize your data structure here. */
        public MyQueue() {
            pushStack = new Stack<>();
            popStack = new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            pushStack.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if (popStack.isEmpty()) {
                pushStack2popStack();
            }
            return popStack.pop();
        }

        /** Get the front element. */
        public int peek() {
            if (popStack.isEmpty()) {
                pushStack2popStack();
            }
            return popStack.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return pushStack.isEmpty() && popStack.isEmpty();
        }

        private void pushStack2popStack() {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }

    }
}
