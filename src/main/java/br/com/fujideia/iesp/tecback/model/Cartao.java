package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Cartao {
    @Id
    private Integer id;
    private String nomeCartao;
    private Integer numcartao;
    private Integer valiCartao;

}
