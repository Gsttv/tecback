package br.com.fujideia.iesp.tecback.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepClient{
    @GetMapping("/{cep}/json")
    String consultaCEP(@PathVariable("cep") String cep);
}
