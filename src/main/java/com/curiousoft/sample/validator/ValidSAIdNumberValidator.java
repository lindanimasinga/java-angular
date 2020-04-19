package com.curiousoft.sample.validator;

import com.curiousoft.sample.annotation.ValidSAIdNumber;
import com.curiousoft.sample.util.SampleUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidSAIdNumberValidator implements ConstraintValidator<ValidSAIdNumber, String> {


    @Override
    public void initialize(ValidSAIdNumber constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return SampleUtils.isSAIdNumber(value);
    }
}
