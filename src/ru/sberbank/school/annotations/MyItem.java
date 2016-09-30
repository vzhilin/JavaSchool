package ru.sberbank.school.annotations;

public class MyItem extends Item {

    //@Override
    public boolean equals(MyItem item) {
        return true;
    }

    public static void main(String[] args) {
        MyItem item1 = new MyItem();
        MyItem item2 = new MyItem();

        System.out.println(item1.equals(item2));
        System.out.println(item1.equals((Object) item2));
    }

}
