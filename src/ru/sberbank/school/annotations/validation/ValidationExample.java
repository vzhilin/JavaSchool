package ru.sberbank.school.annotations.validation;

import java.util.Set;

public class ValidationExample {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("ZhilinTest");

        Validator validator = new FieldsValidator();
        Set<ConstraintViolation> violations = validator.validate(person);

        if (violations.isEmpty()) {
            System.out.println("OK");
        } else {
            System.out.println("INVALID ");
            violations.forEach(violation -> System.out.println("Field: " + violation.getField() + ". Message: " + violation.getMessage()));
        }
    }

}
