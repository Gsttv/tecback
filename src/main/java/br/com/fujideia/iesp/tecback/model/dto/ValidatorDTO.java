package br.com.fujideia.iesp.tecback.model.dto;



import br.com.fujideia.iesp.tecback.validator.NotaValida;
import lombok.Data;

@Data
public class ValidatorDTO {
    @NotaValida()
    private Integer nota;

}
