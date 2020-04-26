package br.com.spring.teste.spring.teste.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teste")
public class SpringTesteController {

	@GetMapping(value = "/{nome}")
	public String exemplo(@PathVariable("nome") String nome){
		return "teste: " + nome;	
	}
}
