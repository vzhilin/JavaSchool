package ru.sberbank.school.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample2 {

    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.compareTo(o2);
            }
        });
        persons.add(new Person(1, "Ivanov", "111"));
        persons.add(new Person(3, "Sidorov", "333"));
        persons.add(new Person(2, "Petrov", "222"));
        persons.add(new Person(4, "Semenov", "444"));

        System.out.println(persons);
    }

}
