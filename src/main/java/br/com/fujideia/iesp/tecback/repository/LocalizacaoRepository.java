package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.Localizacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalizacaoRepository extends JpaRepository<Localizacao,Integer> {
}
