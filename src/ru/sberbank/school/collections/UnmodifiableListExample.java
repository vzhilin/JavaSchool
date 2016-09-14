package ru.sberbank.school.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableListExample {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Ivanov", "111"));
        persons.add(new Person(2, "Petrov", "222"));
        persons.add(new Person(3, "Sidorov", "333"));

        List<Person> unmodifiableListOfPersons = Collections.unmodifiableList(persons);
        unmodifiableListOfPersons.add(new Person(4, "Semenov", "444")); // UnsupportedOperationException
    }

}
