package br.com.fujideia.iesp.tecback.model.dto;


import br.com.fujideia.iesp.tecback.validator.EstadoNordeste;
import lombok.Data;

@Data
public class NordesteDTO {
    @EstadoNordeste
    private String estado;
}