package com.GestionClientes.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.GestionClientes")
@EntityScan(basePackages = "com.GestionClientes.entities")
public class GestionClientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionClientesApplication.class, args);
	}

}
