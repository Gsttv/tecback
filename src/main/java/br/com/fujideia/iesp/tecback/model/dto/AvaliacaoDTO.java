package br.com.fujideia.iesp.tecback.model.dto;



import br.com.fujideia.iesp.tecback.validator.NotaValida;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AvaliacaoDTO {
    @NotaValida
    @NotNull
    private Integer nota;

}
