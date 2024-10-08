package br.gov.sp.fatec.springtopicos20242.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.gov.sp.fatec.springtopicos20242.entity.Anuncio;

public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {
    @Query("SELECT a FROM Anuncio a WHERE a.nomeProduto LIKE %:nome% OR a.preco < :precoMax")
    List<Anuncio> buscarAnunciosNomePreco(
            @Param("nome") String nomeProduto, 
            @Param("precoMax") float precoMax
    );
}
