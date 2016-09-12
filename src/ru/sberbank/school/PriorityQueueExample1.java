package ru.sberbank.school;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample1 {

    public static void main(String[] args) {
        Comparator<Person> comparatorByName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Queue<Person> queue = new PriorityQueue<>(comparatorByName);
        queue.offer(new Person(1, "Ivanov", "111"));
        queue.offer(new Person(3, "Sidorov", "333"));
        queue.offer(new Person(2, "Petrov", "222"));

        for (Person person = queue.poll(); person != null; person = queue.poll()) {
            System.out.println(person);
        }
    }

}
