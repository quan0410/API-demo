package com.spring.boot.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(
        validatedBy = {DobValidator.class}
)
public @interface DobConstraint {
    String message() default "Invalid date ò bỉrth";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int min();

    int max() default Integer.MAX_VALUE;
}
