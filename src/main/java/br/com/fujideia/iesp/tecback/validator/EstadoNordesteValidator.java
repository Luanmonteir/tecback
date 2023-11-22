package br.com.fujideia.iesp.tecback.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class EstadoNordesteValidator implements ConstraintValidator<EstadoNordeste, String> {
    private final List<String> estadosNordeste = Arrays.asList(
            "Paraíba", "Bahia", "Pernambuco", "Rio Grande do Norte",
            "Maranhão", "Piauí", "Alagoas", "Sergipe"
    );

    @Override
    public void initialize(EstadoNordeste constraint) {
        // Nada a inicializar no validador neste caso.
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // Valor nulo será validado em outro lugar, se necessário.
        }

        // Verifica se o estado fornecido está na lista de estados da região Nordeste.
        return estadosNordeste.contains(value);
    }
}