package br.com.estudo.estudospringboot.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estudo.estudospringboot.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
