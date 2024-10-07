package br.gov.sp.fatec.springtopicos20242.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springtopicos20242.entity.Trabalho;
import br.gov.sp.fatec.springtopicos20242.service.TrabalhoService;

@RestController
@RequestMapping(value = "/trabalho")
@CrossOrigin
public class TrabalhoController {
    @Autowired
    private TrabalhoService service;

    @GetMapping(name = "listar")
    public List<Trabalho> todosTrabalho(){
        return service.todosTrabalho();
    }

    @PostMapping(name = "cadastrar")
    public Trabalho cadastrarTrabalho(@RequestBody Trabalho trabalho){
        return service.novoTrabalho(trabalho);
    }

    @GetMapping(name = "listarBy")
    public List<Trabalho> listarBy(@RequestParam String titulo, @RequestParam Integer nota){
        return service.buscaPorTituloAndNota(titulo, nota);
    }
}
