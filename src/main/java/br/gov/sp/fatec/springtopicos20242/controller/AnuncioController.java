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

import br.gov.sp.fatec.springtopicos20242.entity.Anuncio;
import br.gov.sp.fatec.springtopicos20242.service.AnuncioService;

@RestController
@RequestMapping(value = "/anuncio")
@CrossOrigin
public class AnuncioController {
    @Autowired
    private AnuncioService service;

    @GetMapping(value = "listar")
    public List<Anuncio> todosAnuncios(){
        return service.todosAnuncios();
    }

    @PostMapping(value = "cadastrar")
    public Anuncio cadastrarAnuncio(@RequestBody Anuncio anuncio){
        return service.novoAnuncio(anuncio);
    }

    @GetMapping(value = "listarBy")
    public List<Anuncio> listarBy(@RequestParam String nome, @RequestParam float preco){
        return service.buscarAnunciosNomePreco(nome, preco);
    }
}
