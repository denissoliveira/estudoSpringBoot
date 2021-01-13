package br.com.estudo.estudospringboot.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Com RestController ele já assume que tem a anotação ResponseBody
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody //Para ele não considerar que o retorno string é url de uma página
	public String hello() {
		return "Hello World!";
	}

}
