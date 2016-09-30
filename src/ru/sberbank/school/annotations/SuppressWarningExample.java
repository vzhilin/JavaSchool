package ru.sberbank.school.annotations;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("")
public class SuppressWarningExample {

    @Deprecated
    private static int a;

    @SuppressWarnings("unchecked")
    SuppressWarningExample() {

    }

    @SuppressWarnings("unchecked")
    public static void main(@SuppressWarnings("unchecked") String[] args) {
        List list = new ArrayList<Integer>();
        list.add("Test");

        System.out.println(list);

        @SuppressWarnings("deprecation")
        int i = a;
    }

    @SuppressWarnings("unused")
    private static class A<T> {

        Object a;

        public T getA() {
            return (T) a;
        }

    }

}
