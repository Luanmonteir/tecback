package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Cartao;
import br.com.fujideia.iesp.tecback.model.Login;
import br.com.fujideia.iesp.tecback.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginRepository repository;

    public Login salvar (Login login){
        login= repository.save(login);
        return login;
    }
    public Login alterar(Login login){

        return login;
    }
}
