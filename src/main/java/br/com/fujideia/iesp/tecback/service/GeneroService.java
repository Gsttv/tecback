package br.com.fujideia.iesp.tecback.service;


import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.model.Genero;

import br.com.fujideia.iesp.tecback.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository repository;

    public Genero salvar(Genero genero){
        genero = repository.save(genero);
        return genero;
    }

    public List<Genero> listar(){
        return repository.findAll();
    }

}
