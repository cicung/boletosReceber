package br.com.boletos;

import org.junit.Test;

import br.com.boletos.model.Agile;
import br.com.boletos.model.Carro;
import br.com.boletos.model.i30;

public class LaboratorioTest {

	@Test
	public void testandoInterface() {
		
		mostrarVelocidade(new Agile());
		mostrarVelocidade(new i30());
	}
	
	public void mostrarVelocidade(Carro agile) {
		System.out.println(agile.velocidadeMaxima);
	}
}
