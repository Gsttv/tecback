package br.com.fujideia.iesp.tecback.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "omdb", url = "http://www.omdbapi.com/")
public interface OMDClient {
    @GetMapping("?t={movieTitle}&apikey=2040d407")
    String consultaFilme(@PathVariable("movieTitle") String movieTitle);
}
