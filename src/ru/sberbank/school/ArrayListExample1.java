package ru.sberbank.school;

import java.util.ArrayList;

public class ArrayListExample1 {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Ivanov", "111"));
        persons.add(new Person(2, "Petrov", "222"));
        persons.add(new Person(3, "Sidorov", "333"));

        for (int i = 0; i < persons.size(); ++i) {
            System.out.println(persons.get(i));
        }

        persons.trimToSize();
    }

}
