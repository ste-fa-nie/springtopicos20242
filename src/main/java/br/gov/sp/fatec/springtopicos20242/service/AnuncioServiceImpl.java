package br.gov.sp.fatec.springtopicos20242.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.gov.sp.fatec.springtopicos20242.entity.Anuncio;
import br.gov.sp.fatec.springtopicos20242.repository.AnuncioRepository;
import jakarta.transaction.Transactional;

@Service
public class AnuncioServiceImpl implements AnuncioService {
    
    private AnuncioRepository repo;

    public AnuncioServiceImpl(AnuncioRepository repo){
        this.repo = repo;
    }

    @Override
    @Transactional
    public Anuncio novoAnuncio(Anuncio anuncio){
        if(anuncio == null ||
            anuncio.getNomeProduto() == null ||
            anuncio.getPreco() <= 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST ,"Nome ou preço inválidos!");
        }
        if(anuncio.getDataHoraCadastro() == null){
            anuncio.setDataHoraCadastro(LocalDateTime.now());
        }
        return repo.save(anuncio);
    }

    @Override
    public List<Anuncio> todosAnuncios(){
        List<Anuncio> anuncios = new ArrayList<Anuncio>();
        for(Anuncio anuncio: repo.findAll()){
            anuncios.add(anuncio);
        }
        return anuncios;
    }

    @Override
    public List<Anuncio> buscarAnunciosNomePreco(String nome, float preco){
        List<Anuncio> anuncios = new ArrayList<Anuncio>();
        anuncios = repo.buscarAnunciosNomePreco(nome, preco);
        return anuncios;
    }
}
