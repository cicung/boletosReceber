package br.com.boletos.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import br.com.boletos.model.Boleto;

@Service
public class BoletosRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Boleto> list() {

		return jdbcTemplate.query(
				"select cod_boleto, dt_emissãoNF, dt_emissãoBT, dt_operacao, cliente, nf_boleto, Banco,valor_Boleto, dt_vencimento, dt_pagamento from controleboletos",
				(rs, rowNum) -> new Boleto(
						rs.getInt("cod_boleto"), 
						rs.getString("dt_emissãoNF"),
						rs.getString("dt_emissãoBT"), 
						rs.getString("dt_operacao"), 
						rs.getString("cliente"),
						rs.getString("nf_boleto"), 
						rs.getString("Banco"), 
						rs.getFloat("valor_Boleto"),
						rs.getString("dt_vencimento"), 
						rs.getString("dt_pagamento")

				));
	}

	public int insert(Boleto boleto) {

		String query = "insert into controleboletos (dt_emissãoNF, dt_emissãoBT,dt_operacao, cliente, nf_boleto, Banco, valor_Boleto, dt_vencimento, dt_pagamento ) values (?,?,?,?,?,?,?,?,?)";
		return jdbcTemplate.update(query, boleto.getDataEmissaoNF(), boleto.getDataEmissaoBoleto(), boleto.getDataOperacao(), boleto.getCliente(), boleto.getNfBoleto(), boleto.getBanco(), boleto.getValorBoleto(), boleto.getDataVencimento(), boleto.getDataPagamento());

	}

	/*
	 * public void Edit(Boleto boleto) {

	 * }
	 * public void Delete() {
	 * 
	 * } }
	 */

}
