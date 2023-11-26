package br.com.fujideia.iesp.tecback.model;


import br.com.fujideia.iesp.tecback.validator.EstadoNordeste;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_localizaçao")
public class Localizacao {

    @Id
    @GeneratedValue
    private Integer id;
    private String pais;

    @EstadoNordeste
    private String estado;

    private String cidade;
    private String rua;
    private Integer cep;
}
