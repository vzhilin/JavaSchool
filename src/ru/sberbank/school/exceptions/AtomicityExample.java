package ru.sberbank.school.exceptions;

import java.util.EmptyStackException;

public class AtomicityExample {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.pop();
    }

    // Just to show error!
    private static class Stack<T> {

        private T[] elements = (T[]) new Object[1000];

        private int size;

        public T pop() {
            if (size == 0) {
                throw new EmptyStackException();
            }

            T result = elements[--size];
            elements[size] = null; // Eliminate obsolete reference
            return result;
        }

    }

}
