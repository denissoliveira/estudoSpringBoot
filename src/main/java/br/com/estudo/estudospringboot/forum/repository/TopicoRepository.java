package br.com.estudo.estudospringboot.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estudo.estudospringboot.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

}
