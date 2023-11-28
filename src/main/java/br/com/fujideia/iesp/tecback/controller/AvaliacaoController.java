package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.exceptions.CustomException;
import br.com.fujideia.iesp.tecback.model.Avaliacao;
import br.com.fujideia.iesp.tecback.service.AvaliacaoService;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/valida")
@Log4j2
public class AvaliacaoController {

    @Autowired
    private AvaliacaoService avaliacaoService;

    @PostMapping
    public ResponseEntity<Avaliacao> addNota(@Valid @RequestBody Avaliacao avaliacao){
        return ResponseEntity.ok(avaliacaoService.salvar(avaliacao));
    }

    @GetMapping
    public ResponseEntity<List<Avaliacao>> verNotas(){
        return ResponseEntity.ok(avaliacaoService.listar());
    }

}
