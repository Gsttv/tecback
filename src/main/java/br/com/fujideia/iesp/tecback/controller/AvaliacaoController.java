package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Avaliacao;
import br.com.fujideia.iesp.tecback.service.AvaliacaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/valida")
public class AvaliacaoController {

    @Autowired
    private AvaliacaoService avaliacaoService;

    @PostMapping
    public ResponseEntity<Avaliacao> addNota(@Valid Avaliacao avaliacao){
        return ResponseEntity.ok(avaliacaoService.salvar(avaliacao));
    }

    @GetMapping
    public ResponseEntity<List<Avaliacao>> verNotas(){
        return ResponseEntity.ok(avaliacaoService.listar());
    }

}
