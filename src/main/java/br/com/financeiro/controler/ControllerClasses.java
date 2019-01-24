package br.com.financeiro.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerClasses {

	@RequestMapping("/olamundo")
	public String execute() {
		System.out.println("executando uma logica com Spring MVC");
		return "helloworld";
	}
	
	
	@RequestMapping("/index")
	public String rodar() {
		System.out.println("executando uma logica com Spring MVC");
		return "index";
	}
	
}
