package ru.sberbank.school;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample3 {

    public static void main(String[] args) {
        List<Person> persons = new LinkedList<>();
        persons.add(new Person(1, "Ivanov", "111"));
        persons.add(new Person(2, "Petrov", "222"));
        persons.add(new Person(3, "Sidorov", "333"));

        Iterator<Person> iterator = persons.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
