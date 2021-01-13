package br.com.estudo.estudospringboot.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudo.estudospringboot.forum.controller.dto.TopicoDto;
import br.com.estudo.estudospringboot.forum.model.Curso;
import br.com.estudo.estudospringboot.forum.model.Topico;

@RestController
public class TopicosController {

	@RequestMapping("/topicos")
	public List<TopicoDto> lista() {
		Topico topico = new Topico("Duvida", "Duvida com Sprring", new Curso("Spring", "Programação"));
		return Topico.converter(Arrays.asList(topico,topico,topico));
	}
	
}
