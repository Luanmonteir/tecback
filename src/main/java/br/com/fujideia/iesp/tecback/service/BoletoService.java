package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Boleto;
import br.com.fujideia.iesp.tecback.repository.BoletoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class BoletoService {
    @Autowired
    private BoletoRepository repository;

    public Boleto salvar(Boleto boleto) {
        boleto = repository.save(boleto);
        return boleto;
    }

    public Boleto alterar(Boleto boleto) {
        return boleto;
    }
}