package com.saltedfish.crackingthecodinginterview;

import java.util.LinkedList;

/**
 * @author SaltedFish
 * @date 2021/6/3
 */
public class CTCI0306 {
    class AnimalShelf {

        LinkedList<Integer> dog = new LinkedList<>();
        LinkedList<Integer> cat = new LinkedList<>();

        public AnimalShelf() {

        }

        public void enqueue(int[] animal) {
            if (animal[1] == 0) {
                cat.add(animal[0]);
            }

            if (animal[1] == 1) {
                dog.add(animal[0]);
            }
        }

        public int[] dequeueAny() {
            if (dog.isEmpty() && cat.isEmpty()) {
                return new int[]{-1, -1};
            }

            if (dog.isEmpty()) {
                return new int[]{cat.pollFirst(), 0};
            }

            if (cat.isEmpty()) {
                return new int[]{dog.pollFirst(), 1};
            }

            if (dog.peekFirst() < cat.peekFirst()) {
                return new int[]{dog.pollFirst(), 1};
            }
            return new int[]{cat.pollFirst(), 0};
        }

        public int[] dequeueDog() {
            if (dog.isEmpty()) {
                return new int[]{-1, -1};
            }
            return new int[]{dog.pollFirst(), 1};
        }

        public int[] dequeueCat() {
            if (cat.isEmpty()) {
                return new int[]{-1, -1};
            }
            return new int[]{cat.pollFirst(), 0};
        }
    }
}
