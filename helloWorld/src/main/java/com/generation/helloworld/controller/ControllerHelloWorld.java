package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello-World")
public class ControllerHelloWorld {

	@GetMapping

	public String helloWorld() {
		return "Hello World!!";
	}
	
	@GetMapping("/t47")

	public String turma47Bsm() {
		return "Mentalidades: Orientação ao Futuro, Responsabilidade Pessoal, Mentalidade de Crescimento e Persistência" + "\n Habilidades: Trabalho em Equipe, Atenção aos Detalhes, Proatividade e Comunicação.";
		}
	
	@GetMapping("/finalizacao")

	public String objetivo() {
		return "Meu Objetivo hoje é me aperfeiçoar em Rest, colocar em prática meus projetos e ver tudo rodando.";
		}
}
