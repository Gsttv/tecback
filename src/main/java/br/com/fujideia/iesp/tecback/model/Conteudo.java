package br.com.fujideia.iesp.tecback.model;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@MappedSuperclass //indicar que a classe é uma superclasse que fornece mapeamentos de atributos comuns para suas subclasses
@Data
public abstract class Conteudo implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String titulo;
    @Column(name = "ds_sinopse", length = 500)
    private String sinopse;
    private Integer ano;
    @ManyToOne
    private Genero genero;
    @OneToOne
    private Avaliacao avaliacao;
}
