package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Localizacao {


    private Integer id;
    private String pais;
    private String estado;
    private String cidade;
    private String rua;
}
