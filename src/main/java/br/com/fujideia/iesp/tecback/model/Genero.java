package br.com.fujideia.iesp.tecback.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Genero  {
    private String nome;
    @Id
    @GeneratedValue
    private Long id;

}