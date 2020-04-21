package br.com.boletos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.CollectionUtils;

import br.com.boletos.model.Boleto;
import br.com.boletos.repository.BoletosRepository;

/* A classe SpringApplication vai ler as configurações da classe passada 
como argumento e pronto, você tem a sua aplicação no ar. 
A outra parte da mágica acontece por conta da annotation @SpringBootApplication. Ela é um Sterotype
do Spring Boot que já encapsula algumas outras annotations*/
@SpringBootApplication
public class BoletosAplication implements CommandLineRunner {

	// Injetando a classe BoletosRepository
	// Para meu projeto, estou utilizando essa classe para acessar o CRUD
	@Autowired
	BoletosRepository rep;

	public static void main(String[] args) {
		SpringApplication.run(BoletosAplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		// 1 - criar um registro no banco
		Boleto boleto = new Boleto();

		// boleto.setDataEmissaoNF("2020-12-12");
		// boleto.setDataEmissaoBoleto("2020-12-01");
		// boleto.setDataOperacao("2021-12-12");
		// boleto.setCliente("Paulo");
		// boleto.setNfBoleto("1212");
		// boleto.setBanco("Santander");
		// boleto.setValorBoleto(9090);
		// boleto.setDataVencimento("2022-02-01");
		// boleto.setDataPagamento("2023-05-01");

		// rep.insert(boleto);

		// 2 - listar os registros do banco
		// select no banco de dados
		List<Boleto> boletos = rep.list();
		if (!CollectionUtils.isEmpty(boletos)) {
			boletos.forEach(b -> {
				System.out.println("\n");
				System.out.println(b.dataEmissaoNF + b.dataEmissaoBoleto + b.dataOperacao + b.cliente + b.nfBoleto
						+ b.banco + b.valorBoleto + b.dataVencimento + b.dataPagamento

				);
			});
		}

		// 3 - alterar um registro do banco
		// Instanciando o objeto e enviando para o update atualizar
		// Boleto boleto1 = rep.listById(1);
		// boleto1.setCliente("Marcos");
		// rep.edit(boleto1);

		// trazer os campos do Objeto listByiD
		// boleto1.getBanco();
		// System.out.println(boleto1);

		// boleto.setDataEmissaoNF("2020-12-12");
		// boleto.setDataEmissaoBoleto("2020-12-01");
		// boleto.setDataOperacao("2021-12-12");
		// boleto.setCliente("Marcos");
		// boleto.setNfBoleto("1212");
		// boleto.setBanco("Santander");
		// boleto.setValorBoleto(9090);
		// boleto.setDataVencimento("2022-02-01");
		// boleto.setDataPagamento("2023-05-01");
		// boleto.setCodigoBoleto(1);

		// boleto.setCliente(new String("Josefa"));
		// rep.edit(boleto);

		// 4 - apagar um registro do banco
		int boleto2 = rep.deleteById(8);

	}
}
