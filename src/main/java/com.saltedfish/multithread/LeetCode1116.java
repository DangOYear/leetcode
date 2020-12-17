package com.saltedfish.multithread;

import java.util.concurrent.Semaphore;

public class LeetCode1116 {
    class ZeroEvenOdd {
        private int n;
        Semaphore zeroSemaphore = new Semaphore(1);
        Semaphore evenSemaphore = new Semaphore(0);
        Semaphore oddSemaphore = new Semaphore(0);

        public ZeroEvenOdd(int n) {
            this.n = n;
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void zero(IntConsumer printNumber) throws InterruptedException {
            zeroSemaphore.acquire();
            printNumber.accept(0);
            if (n % 2 == 0) {

            }
        }

        public void even(IntConsumer printNumber) throws InterruptedException {

        }

        public void odd(IntConsumer printNumber) throws InterruptedException {

        }
    }
}
