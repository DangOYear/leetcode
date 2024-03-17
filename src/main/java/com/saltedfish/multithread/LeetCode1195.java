package com.saltedfish.multithread;

public class LeetCode1195 {
    class FizzBuzz {
        private int n;
        private int i =1;
        public FizzBuzz(int n) {
            this.n = n;
        }

        // printFizz.run() outputs "fizz".
        public void fizz(Runnable printFizz) throws InterruptedException {
            synchronized (this) {
                while (i <= n) {
                    if (i % 3 == 0 && i % 5 != 0) {
                        printFizz.run();
                        i++;
                        this.notifyAll();
                    } else {
                        this.wait();
                    }

                }
            }
        }

        // printBuzz.run() outputs "buzz".
        public void buzz(Runnable printBuzz) throws InterruptedException {
            synchronized (this) {
                while (i <= n) {
                    if (i % 5 == 0 && i % 3 != 0) {
                        printBuzz.run();
                        i++;
                        this.notifyAll();
                    } else {
                        this.wait();
                    }

                }
            }
        }

        // printFizzBuzz.run() outputs "fizzbuzz".
        public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
            synchronized (this) {
                while (i <= n) {
                    if (i % 5 == 0 && i % 3 == 0) {
                        printFizzBuzz.run();
                        i++;
                        this.notifyAll();
                    } else {
                        this.wait();
                    }

                }
            }
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void number(IntConsumer printNumber) throws InterruptedException {
            synchronized (this) {
                while (i <= n) {
                    if (i % 5 != 0 && i % 3 != 0) {
                        printNumber.accept(i);
                        i++;
                        this.notifyAll();
                    } else {
                        this.wait();
                    }

                }
            }
        }
    }
}
