package br.com.boletos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.boletos.model.Boleto;
import br.com.boletos.repository.BoletoRepository;

@Service
public class BoletoService {

	@Autowired
	private BoletoRepository repository;

	public List<Boleto> list() {
		return repository.list();
	}

	public int insert(Boleto boleto) {
		return repository.insert(boleto);
	}

	public int edit(Boleto boleto) {
		return repository.edit(boleto);
	}

	public int deleteById(Integer codigo) {
		return repository.deleteById(codigo);
	}
}
