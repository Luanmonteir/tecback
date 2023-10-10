package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Pagamento {


    private Integer id;

    private String cod_barra;

    private String vencimento;
    private String nomeUsuario;
}

