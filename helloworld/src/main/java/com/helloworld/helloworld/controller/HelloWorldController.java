package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "BSMs: "
				+ "\r\n- Persistência\r\n"
				+ "- Mentalidade de Crescimento\r\n"
				+ "- Orientação ao Futuro\r\n"
				+ "- Responsabilidade Pessoal\r\n"
				+ "- Trabalho em Equipe\r\n"
				+ "- Comunicação\r\n"
				+ "- Comunicação Não Violenta\r\n"
				+ "- Atenção ao Detalhe\r\n"
				+ "- Proatividade";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Objetivos a aprimorar: "
				+ "\r\n- Orientação aos detalhes\r\n"
				+ "- Hard Skils em Java e Spring\r\n"
				+ "- Trabalho em Equipe\r\n"
				+ "- Responsabilidade Pessoal\r\n";
	}
	
}
