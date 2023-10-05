package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Plano {
    private Integer id;
    private String nome;
    private Double valor;
}
