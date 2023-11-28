package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.exceptions.CustomException;
import br.com.fujideia.iesp.tecback.model.Avaliacao;
import br.com.fujideia.iesp.tecback.repository.AvaliacaoRepository;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class AvaliacaoService {
    @Autowired
    private AvaliacaoRepository repository;

    ModelMapper mapper = new ModelMapper();
    public Avaliacao salvar(Avaliacao avaliacao){
        avaliacao = repository.save(avaliacao);
        return avaliacao;
    }

    public List<Avaliacao> listar(){
        return repository.findAll();
    }
}
