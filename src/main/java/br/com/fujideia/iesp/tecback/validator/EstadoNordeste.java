package br.com.fujideia.iesp.tecback.validator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EstadoNordesteValidator.class)
public @interface EstadoNordeste {
    String message() default "O estado deve estar entre os estados da região Nordeste.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}