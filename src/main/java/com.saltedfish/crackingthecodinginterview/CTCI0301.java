package com.saltedfish.crackingthecodinginterview;

/**
 * @author SaltedFish
 * @date 2021/6/1
 */
public class CTCI0301 {
    class TripleInOne {
        int N = 3;
        int[] tripleInOnestack;
        int[] pos = new int[N];
        int stackSize;

        public TripleInOne(int stackSize) {
            this.stackSize = stackSize;
            tripleInOnestack = new int[stackSize*3];
            for (int i = 0; i < N; i++) {
                pos[i] = i * stackSize;
            }
        }

        public void push(int stackNum, int value) {
            int index = pos[stackNum];
            if (isNotFullStack(stackNum)) {
                tripleInOnestack[index] = value;
                pos[stackNum]++;
            }
        }

        public int pop(int stackNum) {
            int index = pos[stackNum];
            if (isNotEmpty(stackNum)) {
                pos[stackNum]--;
                return tripleInOnestack[index-1];
            } else {
                return -1;
            }
        }

        public int peek(int stackNum) {
            int index = pos[stackNum];
            if (isNotEmpty(stackNum)) {
                return tripleInOnestack[index-1];
            } else {
                return -1;
            }
        }

        private boolean isNotEmpty(int stackNum) {
            return pos[stackNum] > stackNum * stackSize;
        }

        private boolean isNotFullStack(int stackNum) {
            return pos[stackNum] < (stackNum + 1) * stackSize;
        }

        public boolean isEmpty(int stackNum) {
            return pos[stackNum] == stackNum * stackSize;
        }
    }
}
