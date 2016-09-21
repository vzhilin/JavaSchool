package ru.sberbank.school.exceptions.returncode;

public class Page {

    String name;

    static Key makeKey(Page page) {
        return new Key();
    }

}
