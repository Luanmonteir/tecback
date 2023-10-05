package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Plano;
import br.com.fujideia.iesp.tecback.repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanoService {
    @Autowired
    private PlanoRepository repository;

    public Plano salvar (Plano plano){
        plano= repository.save(plano);
        return plano;
    }
    public  Plano alterar(Plano plano){
        return plano;
    }
}