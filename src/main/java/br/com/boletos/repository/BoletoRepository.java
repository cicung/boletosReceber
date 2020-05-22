package br.com.boletos.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import br.com.boletos.model.Boleto;
import br.com.boletos.repository.rowmapper.BoletoRowMapper;

@Service
public class BoletoRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Boleto> list() {

		return jdbcTemplate.query(
				"select cod_boleto, dt_emissãoNF, dt_emissãoBT, dt_operacao, cliente, nf_boleto, Banco,valor_Boleto, dt_vencimento, dt_pagamento from controleboletos", new BoletoRowMapper());
	}

	public int insert(Boleto boleto) {

		String query = "insert into controleboletos (dt_emissãoNF, dt_emissãoBT,dt_operacao, cliente, nf_boleto, Banco, valor_Boleto, dt_vencimento, dt_pagamento ) values (?,?,?,?,?,?,?,?,?)";
		return jdbcTemplate.update(query, boleto.getDataEmissaoNF(), boleto.getDataEmissaoBoleto(),
				boleto.getDataOperacao(), boleto.getCliente(), boleto.getNfBoleto(), boleto.getBanco(),
				boleto.getValorBoleto(), boleto.getDataVencimento(), boleto.getDataPagamento());
	}

	public Boleto listById(Integer codigo) {

		String sql = "select cod_boleto, dt_emissãoNF, dt_emissãoBT, dt_operacao, cliente, nf_boleto, Banco,valor_Boleto, dt_vencimento, dt_pagamento from controleboletos where cod_boleto =?";
		return jdbcTemplate.queryForObject(sql, new Object[] { codigo }, new BoletoRowMapper());
	}

	public int edit(Boleto boleto) {

		String query = "update controleboletos set dt_emissãoNF = ?, dt_emissãoBT = ?, dt_operacao = ? , cliente = ?, nf_boleto = ?, Banco = ?, valor_Boleto = ?, dt_vencimento = ?, dt_pagamento = ? where cod_boleto = ?";
		return jdbcTemplate.update(query, boleto.getDataEmissaoNF(), boleto.getDataEmissaoBoleto(),
				boleto.getDataOperacao(), boleto.getCliente(), boleto.getNfBoleto(), boleto.getBanco(),
				boleto.getValorBoleto(), boleto.getDataVencimento(), boleto.getDataPagamento(),
				boleto.getCodigoBoleto());
	}

	public int deleteById(Integer codigo) {
		
		return jdbcTemplate.update("delete from controleboletos where cod_boleto =?", codigo);
	}
}
