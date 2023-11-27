package br.com.fujideia.iesp.tecback.service;


import br.com.fujideia.iesp.tecback.model.Localizacao;
import br.com.fujideia.iesp.tecback.repository.LocalizacaoRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class LocalizacaoService {
    @Autowired
    private LocalizacaoRepository repository;

    public Localizacao salvar(Localizacao localizacao) {
        localizacao = repository.save(localizacao);
        return localizacao;
    }

    public Localizacao alterar(Localizacao localizacao) {
        if (repository.existsById(localizacao.getId())) {
            return repository.save(localizacao);
        }
        else{
            throw new NotFoundException();
        }

    }
    public List<Localizacao> listar(){
        return repository.findAll();
    }

    public Localizacao consultarPorId(Integer id){
        return repository.findById(id).get();
    }

    public Boolean excluir(Integer id){
        try {
            repository.deleteById(id);
        }catch (Exception e ){
            log.info("Erro ao realizar Exclusão : {}", e);
            return false;

        }
        return true;
    }
}
