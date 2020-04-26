package br.com.spring.teste.spring.teste.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling //desabilitar caso nao utilize scheduleds
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(@Value("${scheduled.example.time}") String scheduledTime){
		return args -> {
			System.out.println("Tempo de configuração do scheduled " + scheduledTime);
		};
	}
}