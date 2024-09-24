package br.gov.sp.fatec.springtopicos20242.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.gov.sp.fatec.springtopicos20242.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{

    @Query("select u from Usuario u where u.nome = :nomeUsuario")
    public Optional<Usuario> buscarPorNome(String nomeUsuario);

    public Optional<Usuario> findByNome(String nomeUsuario);

    @Query("select u from Usuario u where u.nome = ?1 and u.senha = ?2")
    public Optional<Usuario> buscarPorNomeESenha(String nomeUsuario, String senha);

    public Optional<Usuario> findByNomeAndSenha(String nomeUsuario, String senha);

    @Query("select u from Usuario u join u.autorizacoes a where a.nome = :autorizacao")
    public List<Usuario> buscarPorNomeAutorizacao(String autorizacao);

    public List<Usuario> findByAutorizacoesNome(String autorizacao);

    public List<Usuario> findByNomeContains(String nome);

    public List<Usuario> findByIdGreaterThan(Long id);
    
}
