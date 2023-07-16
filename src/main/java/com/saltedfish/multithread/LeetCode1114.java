package com.saltedfish.multithread;

import java.util.concurrent.atomic.AtomicInteger;

public class LeetCode1114 {
    class Foo {

        public Foo() {

        }

        private AtomicInteger firstJobDone = new AtomicInteger(0);
        private AtomicInteger secondJobDone = new AtomicInteger(1);

        public void first(Runnable printFirst) throws InterruptedException {

            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            firstJobDone.incrementAndGet();
        }

        public void second(Runnable printSecond) throws InterruptedException {
            while (firstJobDone.get() != 1);
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            secondJobDone.incrementAndGet();
        }

        public void third(Runnable printThird) throws InterruptedException {
            while (secondJobDone.get() != 2);
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
        }
    }
}
