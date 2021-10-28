package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld2")
public class HelloWorld2 {

	@GetMapping
	public String helloWorld2() {
		return "Minha meta de aprendizagem para está semana é entender completamente os conteúdos passados sobre Spring";
	}
}