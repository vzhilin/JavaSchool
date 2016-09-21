package ru.sberbank.school.exceptions;

public class StackOverflowErrorExample {

    private static void doSomething() {
        doSomething();
    }

    public static void main(String[] args) {
        doSomething();
    }

}
