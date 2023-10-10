package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Localizacao;
import br.com.fujideia.iesp.tecback.service.LocalizacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/localizacao")
public class LocalizacaoController {
    @Autowired
    private LocalizacaoService service;

    @PostMapping
    public ResponseEntity<Localizacao> salvar(@RequestBody Localizacao localizacao){
        localizacao = service.salvar(localizacao);
        return ResponseEntity.ok(localizacao);
    }
    @PutMapping
    public ResponseEntity<Localizacao> alterar(@RequestBody Localizacao localizacao){
        localizacao = service.alterar(localizacao);
        return ResponseEntity.ok(localizacao);
    }
}