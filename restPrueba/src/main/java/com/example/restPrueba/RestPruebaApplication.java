package com.example.restPrueba;

import com.example.restPrueba.Entities.Persona;
import com.example.restPrueba.Repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestPruebaApplication {


	public static void main(String[] args) {
		SpringApplication.run(RestPruebaApplication.class, args);
		System.out.println("Estoy funcionando correctamente");

	}

}


