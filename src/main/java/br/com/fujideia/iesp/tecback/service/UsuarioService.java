package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Usuario;
import br.com.fujideia.iesp.tecback.repository.UsuarioRepository;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;
    public Usuario salvar(Usuario usuario){
        return repository.save(usuario);
    }
    public Usuario alterar(Usuario usuario) {

        if (repository.existsById(usuario.getId())) {

            return repository.save(usuario);
        }
        else{
            throw new NotFoundException();
        }
    }
}
