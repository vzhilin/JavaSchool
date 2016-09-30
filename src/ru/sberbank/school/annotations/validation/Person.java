package ru.sberbank.school.annotations.validation;

public class Person {

    @NotNull
    @Length(max = 5)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
