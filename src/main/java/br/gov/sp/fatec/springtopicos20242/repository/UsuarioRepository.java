package br.gov.sp.fatec.springtopicos20242.repository;

import org.springframework.data.repository.CrudRepository;

import br.gov.sp.fatec.springtopicos20242.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
    
}
