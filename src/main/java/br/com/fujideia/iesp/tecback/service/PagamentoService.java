package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Pagamento;
import br.com.fujideia.iesp.tecback.repository.PagamentoRepository;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}