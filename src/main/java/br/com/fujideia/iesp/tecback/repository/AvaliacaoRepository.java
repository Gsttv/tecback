package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.Avaliacao;
import jdk.jfr.Label;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
}
