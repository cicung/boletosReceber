package br.com.boletos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/boleto")
public class BoletoController {
	
	@RequestMapping("/list")
	public String list() {
		return "boleto/list";
	}

}
