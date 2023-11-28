package br.com.fujideia.iesp.tecback.validator;

import br.com.fujideia.iesp.tecback.exceptions.CustomException;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class NotaValidaValidator implements ConstraintValidator<NotaValida,Integer> {
    @Override
    public void initialize(NotaValida constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {
        if (value == null){
            log.warn("Valor: " + value);
            return false;
        }
        return value >= 0 && value <=5;
    }
}
