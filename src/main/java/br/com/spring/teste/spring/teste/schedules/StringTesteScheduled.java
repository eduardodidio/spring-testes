package br.com.spring.teste.spring.teste.schedules;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

public class StringTesteScheduled {

	private static final Logger log = LoggerFactory.getLogger(StringTesteScheduled.class);
	
	@Value("${scheduled.example.time}")
	public void testeScheduled(){
		log.info("Scheduled executado com sucesso");
	}
}
