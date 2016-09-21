package ru.sberbank.school.exceptions;

public class ArrayStoreExceptionExample {

    public static void main(String[] args) {
        Object[] objectArray = new Long[1];
        objectArray[0] = "I don't fit in"; // Throws ArrayStoreException
    }

}
