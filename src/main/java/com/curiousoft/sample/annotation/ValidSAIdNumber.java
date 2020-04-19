package com.curiousoft.sample.annotation;

import com.curiousoft.sample.validator.ValidSAIdNumberValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidSAIdNumberValidator.class)
public @interface ValidSAIdNumber {
    String message() default "{com.curiousoft.sample.error.idnumber.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
