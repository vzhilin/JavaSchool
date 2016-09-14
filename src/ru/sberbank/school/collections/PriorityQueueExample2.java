package ru.sberbank.school.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample2 {

    public static void main(String[] args) {
        Queue<Person> queue = new PriorityQueue<>();
        queue.offer(new Person(1, "Ivanov", "111"));
        queue.offer(new Person(3, "Sidorov", "333"));
        queue.offer(new Person(2, "Petrov", "222"));

        for (Person person = queue.poll(); person != null; person = queue.poll()) {
            System.out.println(person);
        }
    }

}
