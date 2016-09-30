package ru.sberbank.school;

public class OverrideExample {

    public static void main(String args[]) {
        X x = new Y();
        Y y = new Y();

        x.test1();
        x.test2("somevalue");
        x.test3();

        y.test1();
        y.test2((Integer) null);
        y.test2(new Object());
        y.test3();

        System.out.println(x.var1);

        String s = y.test3();
        Integer sq = (Integer)((X) y).test3();

        System.out.println(sq);
    }

    static class X {

        public int var1 = 1;

        public void test1() {
            System.out.println("x1");
        }

        public void test2(Object x2) {
            System.out.println("x2");
        }

        public Object test3() {
            System.out.println("x3");
            return 2323.0;
        }
    }

    static class Y extends X {

        public int var1 = 2;

        public void test1() {
            System.out.println("y1");
        }

        public void test2(String x2) {
            System.out.println("y2");
        }


        public void test2(Integer x2) {
            System.out.println("y2");
        }

        public String test3() {
            System.out.println("y3");
            return "";
        }
    }

}
