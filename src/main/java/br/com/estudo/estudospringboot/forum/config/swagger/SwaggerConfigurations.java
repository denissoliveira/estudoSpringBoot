package br.com.estudo.estudospringboot.forum.config.swagger;

import java.util.Arrays;

import org.springframework.context.annotation.Configuration;

import br.com.estudo.estudospringboot.forum.modelo.Usuario;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfigurations {
	
	public Docket forumApi() {
		return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.alura.forum"))
                .paths(PathSelectors.ant("/**"))
                .build()
                .ignoredParameterTypes(Usuario.class); //Ignora os parametros do usuário, não expor a senha etc
//                .globalOperationParameters(
//                        Arrays.asList(
//                                new ParameterBuilder()
//                                    .name("Authorization")
//                                    .description("Header para Token JWT")
//                                    .modelRef(new ModelRef("string"))
//                                    .parameterType("header")
//                                    .required(false)
//                                    .build()));
	}

}
