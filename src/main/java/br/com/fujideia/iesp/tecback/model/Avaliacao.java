package br.com.fujideia.iesp.tecback.model;

import br.com.fujideia.iesp.tecback.validator.NotaValida;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Avaliacao {
    @NotaValida
    private Integer nota;
    @Id
    private Long id;
}
