package br.com.fujideia.iesp.tecback.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class NotaValidaValidator implements ConstraintValidator<NotaValida,Integer> {
    @Override
    public void initialize(NotaValida constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null){
            return true;
        }
        return value >= 0 && value <=5;
    }
}
