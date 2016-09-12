package ru.sberbank.school;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample5 {

    public static void main(String[] args) {
        List<Person> persons = new LinkedList<>();
        persons.add(new Person(1, "Ivanov", "111"));
        persons.add(new Person(2, "Petrov", "222"));
        persons.add(new Person(3, "Sidorov", "333"));

        for (Person person : persons) {
            persons.add(2, new Person(4, "Semenov", "444")); // ConcurrentModificationException
        }
    }

}
