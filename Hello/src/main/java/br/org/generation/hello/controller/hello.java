package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class hello{
	
@GetMapping	
public String helloShow() {
	return "Hello Familia 36- uEPAAAAA";
}
}