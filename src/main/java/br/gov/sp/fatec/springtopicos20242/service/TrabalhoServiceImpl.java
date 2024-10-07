package br.gov.sp.fatec.springtopicos20242.service;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.gov.sp.fatec.springtopicos20242.entity.Trabalho;
import br.gov.sp.fatec.springtopicos20242.repository.TrabalhoRepository;
import jakarta.transaction.Transactional;

@Service
public class TrabalhoServiceImpl implements TrabalhoService{
    
    private TrabalhoRepository repo;

    public TrabalhoServiceImpl(TrabalhoRepository repo){
        this.repo = repo;
    }

    @Override
    @Transactional
    public Trabalho novoTrabalho(Trabalho trabalho){
        if(trabalho == null ||
            trabalho.getTitulo() == null ||
            trabalho.getNota() == null ||
            trabalho.getDescricao().isBlank()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST ,"Titulo, nota ou descrição inválidos!");
        }
        return repo.save(trabalho);
    }

    @Override
    public List<Trabalho> todosTrabalho(){
        List<Trabalho> trabalhos = new ArrayList<Trabalho>();
        for(Trabalho trabalho: repo.findAll()){
            trabalhos.add(trabalho);
        }
        return trabalhos;
    }

}
