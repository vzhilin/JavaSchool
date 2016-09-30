package ru.sberbank.school.annotations;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class LoggingProxyExample {

    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>();

        List<String> loggedList = (List<String>)
                Proxy.newProxyInstance(
                        ClassLoader.getSystemClassLoader(),
                        new Class[]{List.class},
                        new LogHandler(originalList)
                );

        loggedList.add("ZhilinTest");

        loggedList.isEmpty();
    }

    private static class LogHandler implements InvocationHandler {

        private final Object delegate;

        public LogHandler(Object delegate) {
            this.delegate = delegate;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("Invoking method " + method.getName() + "...");

            Object result = method.invoke(delegate, args);

            System.out.println("Method " + method.getName() + "invoked, returned value = " + result);

            return result;
        }

    }

}
