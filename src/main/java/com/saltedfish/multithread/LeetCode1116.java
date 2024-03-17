package com.saltedfish.multithread;

import java.util.concurrent.Semaphore;

class IntConsumer {
    public int accept(int val) {
        return 1;
    }
}

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
            for (int i = 1; i <= n; i++) {
                zeroSemaphore.acquire();
                printNumber.accept(0);
                if (i % 2 == 1) {
                    oddSemaphore.release();
                } else {
                    evenSemaphore.release();
                }
            }

            
        }

        public void even(IntConsumer printNumber) throws InterruptedException {
            for (int i = 2; i <= n; i+=2) {
                zeroSemaphore.acquire();
                printNumber.accept(i);
                zeroSemaphore.release();
            }
        }

        public void odd(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i+=2) {
                oddSemaphore.acquire();
                printNumber.accept(i);
                zeroSemaphore.release();
            }
        }
    }
}
