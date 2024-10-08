package br.gov.sp.fatec.springtopicos20242.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "anc_anuncio")
public class Anuncio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "anc_id")
    private Long id;

    @Column(name = "anc_nome_produto")
    private String nomeProduto;

    @Column(name = "anc_data_hora_cadastro")
    private LocalDateTime dataHoraCadastro;

    @Column(name = "anc_descricao")
    private String descricao;

    @Column(name = "anc_preco")
    private Float preco;

    @Column(name = "anc_peso")
    private Float peso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public LocalDateTime getDataHoraCadastro() {
        return dataHoraCadastro;
    }

    public void setDataHoraCadastro(LocalDateTime dataHoraCadastro) {
        this.dataHoraCadastro = dataHoraCadastro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Float getPeso() {
        return peso != null ? peso : 0.0f;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

}
