package ru.sberbank.school.collections;

import java.io.Console;
import java.io.IOException;
import java.util.LinkedList;

public class LinkedListFootprintExample {

    private LinkedList<Object> list;

    private void test() {
        Console console = System.console();

        console.readLine();

        list.add(null);
        console.readLine();

        for (int i = 0; i < 15; i++) list.add(null);
        console.readLine();

        for (int i = 0; i < 1000; i++) list.add(null);
        console.readLine();
    }

    LinkedListFootprintExample(LinkedList<Object> list) {
        this.list = list;
    }

    public static void main(String[] args) throws IOException {
        LinkedListFootprintExample example =  new LinkedListFootprintExample(new LinkedList<>());
        example.test();
    }

}
