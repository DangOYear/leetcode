package com.saltedfish.crackingthecodinginterview;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author SaltedFish
 * @date 2021/6/3
 */
public class CTCI0303 {
    class StackOfPlates {

        private List<Stack<Integer>> setOfStacks;
        private int capacity;

        public StackOfPlates(int cap) {
            this.setOfStacks = new ArrayList<>();
            this.capacity = cap;
        }

        public void push(int val) {

            if (capacity <= 0) {
                return;
            }

            if (setOfStacks.isEmpty()) {
                setOfStacks.add(new Stack<>());
            }

            if (setOfStacks.get(setOfStacks.size() - 1).size() >= capacity) {
                setOfStacks.add(new Stack<>());
            }

            Stack<Integer> lastStack = setOfStacks.get(setOfStacks.size() - 1);
            lastStack.push(val);
        }

        public int pop() {
            if (setOfStacks.isEmpty()) {
                return -1;
            }

            Stack<Integer> lastStack = setOfStacks.get(setOfStacks.size() - 1);
            int val = lastStack.pop();
            if (lastStack.isEmpty()) {
                setOfStacks.remove(lastStack);
            }
            return val;
        }

        public int popAt(int index) {
            if (index < 0 || index >= setOfStacks.size()) {
                return -1;
            }

            Stack<Integer> stack = setOfStacks.get(index);
            int val = stack.pop();
            if (stack.isEmpty()) {
                setOfStacks.remove(stack);
            }
            return val;
        }
    }
}
