package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Pagamento;
import br.com.fujideia.iesp.tecback.repository.PagamentoRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PagamentoService {
    @Autowired
    private PagamentoRepository repository;

    public Pagamento salvar(Pagamento pagamento) {
        pagamento = repository.save(pagamento);
        return pagamento;
    }

    public Pagamento alterar(Pagamento pagamento) {
        if (repository.existsById(pagamento.getId())) {
            return repository.save(pagamento);
        } else {
            throw new NotFoundException();
        }
    }
    public List<Pagamento> listar(){
        return repository.findAll();
    }

    public Pagamento consultarPorId(Integer id){
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