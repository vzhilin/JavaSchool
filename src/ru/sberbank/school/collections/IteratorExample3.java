package ru.sberbank.school.collections;

import java.util.LinkedList;
import java.util.List;

public class IteratorExample3 {

    public static void main(String[] args) {
        List<Person> persons = new LinkedList<>();
        persons.add(new Person(1, "Ivanov", "111"));
        persons.add(new PrivilegedPerson(2, "Petrov", "222"));
        persons.add(new Person(3, "Sidorov", "333"));
        persons.add(new Person(4, "Semenov", "444"));

        for (Person person : persons) {
            persons.remove(person); // ConcurrentModificationException
        }

        System.out.println(persons);
    }

}
