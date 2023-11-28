package br.com.fujideia.iesp.tecback.model;

import br.com.fujideia.iesp.tecback.validator.NotaValida;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotaValida
    @NotNull
    private Integer nota;
}
