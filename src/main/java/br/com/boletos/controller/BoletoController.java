package br.com.boletos.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	
	
	//TODO
	/**
	 * Criar um novo método com a rota /edit
	 * Esse método deve receber o id do boleto
	 * 
	 * Com esse ID, buscar o boleto no banco de dados e retornar pra tela
	 */

	@GetMapping("/edit/{codigoBoleto}")
	public String edit(@PathVariable("codigoBoleto")Integer codigo, Model model) {	
		 Boleto boleto = rep.listById(codigo);		 
		 model.addAttribute("boleto", boleto);
		return "/boleto/edit";
		
	}
	
	//TODO 2
	/**
	 * Começar esse, somente quando o passo acima estiver tudo ok
	 * 
	 * Criar um novo método com a rota /update
	 * Esse método vai receber um único objeto (Boleto)
	 * Salvar esse objeto no banco
	 */
	@PostMapping("/update/{codigoBoleto}")
	public String update(@PathVariable("codigoBoleto")Integer codigo, @Valid Boleto boleto, BindingResult result, Model model) {			 
		    if (result.hasErrors()) {
		        boleto.setCodigoBoleto(codigo);
		        return "/boleto/update";
		    }
		
		    rep.insert(boleto);		    
		    model.addAttribute("boleto", rep.list());
		return "/boleto/list";
		
	}
}
