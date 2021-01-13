package br.com.estudo.estudospringboot.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudo.estudospringboot.forum.controller.dto.TopicoDto;
import br.com.estudo.estudospringboot.forum.model.Topico;
import br.com.estudo.estudospringboot.forum.repository.TopicoRepository;

@RestController
public class TopicosController {
	
	@Autowired
	private TopicoRepository topicoRepository;
	
	@RequestMapping("/topicos")
	public List<TopicoDto> lista() {
		return Topico.converter(topicoRepository.findAll());
	}
	
}
