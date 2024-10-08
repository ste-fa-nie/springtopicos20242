package br.gov.sp.fatec.springtopicos20242.service;

import java.util.List;

import br.gov.sp.fatec.springtopicos20242.entity.Anuncio;

public interface AnuncioService {
    public Anuncio novoAnuncio(Anuncio anuncio);

    public List<Anuncio> todosAnuncios();

    public List<Anuncio> buscarAnunciosNomePreco(String nomeProduto, float preco);
}
