package com.proyectodb.proyectobas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableSwagger2

public class ProyectobasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectobasApplication.class, args);
	}
}

	@Bean
	public Docket api(){
	return new Docket(DocumentationType.SWWAGER_2)
			.select()
			.apis(RequestHandSelectors.basePackage("com.proyectodb.proyectobas")
					.)

	}
