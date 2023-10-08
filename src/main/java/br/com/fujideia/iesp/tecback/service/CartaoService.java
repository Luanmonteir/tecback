package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Cartao;
import br.com.fujideia.iesp.tecback.repository.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CartaoService {
    @Autowired
    private CartaoRepository cartaoRepository;

    public Cartao salvar(Cartao cartao){

        return cartaoRepository.save(cartao);
    }

    public Cartao alterar(Cartao cartao){

        return cartao;
    }
}

