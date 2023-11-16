package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.Series;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository<Series,Integer> {
}
