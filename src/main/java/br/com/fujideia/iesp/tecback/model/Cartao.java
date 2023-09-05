package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Cartao {
    private Integer id=1;
    private String nomeCartao="luan";
    private Integer numcartao=1123;
    private Integer valiCartao=12/21;

}
