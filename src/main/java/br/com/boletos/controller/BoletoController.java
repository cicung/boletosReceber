package br.com.boletos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import br.com.boletos.model.Boleto;
import br.com.boletos.repository.BoletoRepository;

@Controller
@RequestMapping("/boleto")
public class BoletoController {
	
	@Autowired
	BoletoRepository rep;
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("boletos", rep.list());	
		return "boleto/list";
	}
	
	@GetMapping("/add")
	public String add(Boleto boleto) {
		return "boleto/add";
	}

	@PostMapping("/save")
	public RedirectView salvar(Boleto boleto) {
		rep.insert(boleto);
		return new RedirectView("/boleto/list");
	}
	
	@GetMapping("/edit/{codigoBoleto}")
	public String edit(@PathVariable("codigoBoleto")Integer codigo, Model model) {	
		 Boleto boleto = rep.listById(codigo);		 
		 model.addAttribute("boleto", boleto);
		 return "/boleto/edit";
		
	}
	
	@PostMapping("/update")
	public RedirectView update(Boleto boleto) {			     
		  rep.edit(boleto);
		  return new RedirectView ("/boleto/list");
	}
	
	@GetMapping("/delete/{codigoBoleto}")
	public RedirectView deleteById(@PathVariable("codigoBoleto")Integer codigo) {
		  rep.deleteById(codigo);
		  return new RedirectView ("/boleto/list");
	}
}
