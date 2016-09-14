package ru.sberbank.school.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

    public static void main(String[] args) {
        Person ivanov = new Person(1, "Ivanov", "111");
        Person petrov = new Person(2, "Petrov", "222");
        Person sidorov = new Person(3, "Sidorov", "333");

        Map<Integer, Person> persons = new HashMap<>();
        persons.put(ivanov.getId(), ivanov);
        persons.put(petrov.getId(), petrov);
        persons.put(sidorov.getId(), sidorov);

        System.out.println(persons);

        System.out.println(persons.get(3));
    }

}
