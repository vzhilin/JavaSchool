package ru.sberbank.school.annotations.validation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FieldsValidator implements Validator {

    private static final Map<Class<? extends Annotation>, AnnotationValidator> validators;

    static {
        Map<Class<? extends Annotation>, AnnotationValidator> tmpValidators = new HashMap<>(2);
        tmpValidators.put(NotNull.class, new NotNullValidator());
        tmpValidators.put(Length.class, new LengthValidator());

        validators = tmpValidators;
    }

    private Object getFieldValue(Field field, Object object) {
        Object value = null;

        try {
            field.setAccessible(true);
            value = field.get(object);
        } catch (IllegalAccessException ignored) {
        }

        return value;
    }

    private void validateField(Set<ConstraintViolation> violations, Field field, Object object) {
        Object value = getFieldValue(field, object);

        for (Map.Entry<Class<? extends Annotation>, AnnotationValidator> entry : validators.entrySet()) {
            Class<? extends Annotation> annotationToCheck = entry.getKey();

            if (field.isAnnotationPresent(annotationToCheck)) {
                AnnotationValidator annotationValidator = entry.getValue();
                Annotation annotation = field.getAnnotation(annotationToCheck);

                @SuppressWarnings("unchecked")
                String message = annotationValidator.validate(annotation, value);

                if (message != null) {
                    ConstraintViolation violation = new ConstraintViolation(field, message);
                    violations.add(violation);
                }
            }
        }
    }

    public Set<ConstraintViolation> validate(Object object) {
        Set<ConstraintViolation> violations = new HashSet<>();

        Class<?> clazz = object.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            validateField(violations, field, object);
        }

        return violations;
    }


    /**
     * Consider revising: WRONG design!!!
     * @param <T>
     */
    private interface AnnotationValidator<T extends Annotation> {

        @Deprecated
        String validate(T annotation, Object value);

    }

    private static class NotNullValidator implements AnnotationValidator<NotNull> {

        @Override
        public String validate(NotNull annotation, Object value) {
            return value == null ? annotation.message() : null;
        }

    }

    private static class LengthValidator implements AnnotationValidator<Length> {

        @Override
        public String validate(Length annotation, Object value) {
            if (value != null) {
                int length = value.toString().length();
                if (length < annotation.min() || length > annotation.max()) {
                    return annotation.message() + " But was " + length;
                }
            }
            return null;
        }

    }

}
