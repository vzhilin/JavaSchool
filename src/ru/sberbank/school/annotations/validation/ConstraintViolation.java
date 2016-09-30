package ru.sberbank.school.annotations.validation;

import java.lang.reflect.Field;

public class ConstraintViolation {

    private final Field field;

    private final String message;

    public ConstraintViolation(Field field, String message) {
        this.field = field;
        this.message = message;
    }

    public Field getField() {
        return field;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConstraintViolation violation = (ConstraintViolation) o;

        if (field != null ? !field.equals(violation.field) : violation.field != null) return false;
        return message != null ? message.equals(violation.message) : violation.message == null;

    }

    @Override
    public int hashCode() {
        int result = field != null ? field.hashCode() : 0;
        result = 31 * result + (message != null ? message.hashCode() : 0);
        return result;
    }

}
