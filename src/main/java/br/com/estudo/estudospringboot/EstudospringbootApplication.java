package br.com.estudo.estudospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport //pega da requisicao os parametros e passa para o spring data
public class EstudospringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudospringbootApplication.class, args);
	}

}
