package ru.sberbank.school.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {

    public static void main(String[] args) {
        Person ivanov = new Person(1, "Ivanov", "111");
        Person petrov = new Person(2, "Petrov", "222");
        Person sidorov = new Person(3, "Sidorov", "333");

        List<Person> persons = new LinkedList<>();
        Collections.addAll(persons, ivanov, petrov, sidorov);

        System.out.println(persons.contains(ivanov));
        System.out.println(persons.contains(new Person(1, "Ivanov", "111")));

        // Далее добавляю equals + hashCode
    }

}
