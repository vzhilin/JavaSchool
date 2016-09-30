package ru.sberbank.school.annotations.validation;

import java.util.Set;

public interface Validator {

    Set<ConstraintViolation> validate(Object object);

}
