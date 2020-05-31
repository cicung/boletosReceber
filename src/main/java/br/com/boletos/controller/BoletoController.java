package br.com.boletos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.boletos.model.Boleto;
import br.com.boletos.repository.BoletoRepository;

@Controller
@RequestMapping("/boleto")
public class BoletoController {
	
	//TODO injetar repositorio
	@Autowired
	BoletoRepository rep;
	
	@RequestMapping(value = {"/list"}, method = RequestMethod.GET)
	public String list(Model model) {
		List<Boleto> boletos = rep.list();
		model.addAttribute("boletos", rep.list());	
		return "boleto/list";
	}
	
	@RequestMapping(value = {"/add"}, method = RequestMethod.GET)
	public String add() {
		//Boleto boletos = new Boleto();
		//boletos.addObject("boleto", boleto);

		return "boleto/add";
	}

	//@RequestMapping(value = {"/salvar"}, method = RequestMethod.POST)
	//public String salvar(Model model) {
		//Boleto boleto = new Boleto();
		//rep.insert(boleto);
		//return "boleto/add";
	//}

}
