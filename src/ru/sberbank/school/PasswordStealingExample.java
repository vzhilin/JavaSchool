package ru.sberbank.school;

import java.io.Console;
import java.util.Arrays;

public class PasswordStealingExample {

    public static void main(String[] args) {
        Console console = System.console();

        String userName = console.readLine("Enter your user name: ");
        String password = console.readLine("Enter your password: ");

        char[] pwd = console.readPassword();
        Arrays.fill(pwd, '0');

       // userName = password = null;
        console.readLine();
    }

}
