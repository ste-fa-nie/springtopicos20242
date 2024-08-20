package br.gov.sp.fatec.springtopicos20242.service;

import java.util.List;

import br.gov.sp.fatec.springtopicos20242.entity.Usuario;

public interface UsuarioService {

    public Usuario novoUsuario(Usuario usuario);

    public List<Usuario> todosUsuarios();

    public Usuario buscarPeloId(Long id);
    
}
