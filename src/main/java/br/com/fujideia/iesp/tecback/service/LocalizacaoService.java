package br.com.fujideia.iesp.tecback.service;


import br.com.fujideia.iesp.tecback.model.Localizacao;
import br.com.fujideia.iesp.tecback.repository.LocalizacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalizacaoService {
    @Autowired
    private LocalizacaoRepository repository;

    public Localizacao salvar(Localizacao localizacao) {
        localizacao = repository.save(localizacao);
        return localizacao;
    }

    public Localizacao alterar(Localizacao localizacao) {
        return localizacao;
    }
}