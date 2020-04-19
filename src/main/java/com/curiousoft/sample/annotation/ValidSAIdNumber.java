package com.curiousoft.sample.annotation;

import com.curiousoft.sample.validator.ValidSAIdNumberValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidSAIdNumberValidator.class)
@Documented
public @interface ValidSAIdNumber {
    String message() default "{com.curiousoft.sample.error.idnumber.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
