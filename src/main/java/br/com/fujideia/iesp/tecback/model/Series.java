package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Series extends Conteudo implements Serializable {

    private Integer quantidadeDeEpisodios;

}
