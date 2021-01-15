package br.com.estudo.estudospringboot.forum.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estudo.estudospringboot.forum.model.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {
	
	Optional<Usuario> findBeEmail(String Email);

}
