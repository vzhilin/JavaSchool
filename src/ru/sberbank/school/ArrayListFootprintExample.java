package ru.sberbank.school;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListFootprintExample {

    private ArrayList<Object> list;

    private void test() {
        Console console = System.console();

        console.readLine();

        list.add(null);
        console.readLine();

        for (int i = 0; i < 15; i++) list.add(null);
        console.readLine();

        list.trimToSize();
        console.readLine();

        for (int i = 0; i < 1000; i++) list.add(null);
        console.readLine();
    }

    ArrayListFootprintExample(ArrayList<Object> list) {
        this.list = list;
    }

    public static void main(String[] args) throws IOException {
        ArrayListFootprintExample example =  new ArrayListFootprintExample(new ArrayList<>());
        example.test();

    }

}
