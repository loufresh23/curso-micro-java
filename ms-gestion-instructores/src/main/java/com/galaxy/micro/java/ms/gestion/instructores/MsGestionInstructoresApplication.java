package com.galaxy.micro.java.ms.gestion.instructores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(/*exclude = {DataSourceAutoConfiguration.class}*/)
public class MsGestionInstructoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsGestionInstructoresApplication.class, args);
	}

}
