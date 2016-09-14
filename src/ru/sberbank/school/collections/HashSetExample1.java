package ru.sberbank.school.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {

    public static void main(String[] args) {
        Person ivanov = new Person(1, "Ivanov", "111");
        Person petrov = new Person(2, "Petrov", "222");
        Person sidorov = new Person(3, "Sidorov", "333");

        Set<Person> persons = new HashSet<>();
        Collections.addAll(persons, ivanov, petrov, sidorov);

        System.out.println(persons.contains(petrov));

        petrov.setPhoneNumber("444");
        System.out.println(persons.contains(petrov));
    }

}
