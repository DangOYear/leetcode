package com.saltedfish.algorithms;

import com.saltedfish.baseclass.NestedInteger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * @author SaltedFish
 * @date 2021/3/23
 */
public class LeetCode0341 {
    public class NestedIterator implements Iterator<Integer> {

        private Stack<Iterator<NestedInteger>> stack;

        public NestedIterator(List<NestedInteger> nestedList) {
            stack = new Stack<>();
            stack.push(nestedList.iterator());
        }

        @Override
        public Integer next() {
            return stack.peek().next().getInteger();
        }

        @Override
        public boolean hasNext() {
            while (!stack.isEmpty()) {
                Iterator<NestedInteger> it = stack.peek();
                if (!it.hasNext()) {
                    stack.pop();
                    continue;
                }

                NestedInteger nestedInteger = it.next();
                if (nestedInteger.isInteger()) {
                    List<NestedInteger> list = new ArrayList<>();
                    list.add(nestedInteger);
                    stack.push(list.iterator());
                    return true;
                }
                stack.push(nestedInteger.getList().iterator());
            }
            return false;
        }
    }

}
