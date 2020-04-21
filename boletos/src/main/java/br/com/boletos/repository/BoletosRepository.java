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
				(rs, rowNum) -> new Boleto(rs.getInt("cod_boleto"), rs.getString("dt_emissãoNF"),
						rs.getString("dt_emissãoBT"), rs.getString("dt_operacao"), rs.getString("cliente"),
						rs.getString("nf_boleto"), rs.getString("Banco"), rs.getFloat("valor_Boleto"),
						rs.getString("dt_vencimento"), rs.getString("dt_pagamento")

				));
	}

	public int insert(Boleto boleto) {

		String query = "insert into controleboletos (dt_emissãoNF, dt_emissãoBT,dt_operacao, cliente, nf_boleto, Banco, valor_Boleto, dt_vencimento, dt_pagamento ) values (?,?,?,?,?,?,?,?,?)";
		return jdbcTemplate.update(query, boleto.getDataEmissaoNF(), boleto.getDataEmissaoBoleto(),
				boleto.getDataOperacao(), boleto.getCliente(), boleto.getNfBoleto(), boleto.getBanco(),
				boleto.getValorBoleto(), boleto.getDataVencimento(), boleto.getDataPagamento());

	}

	public Boleto listById(Integer codigo) {

		String sql = "select cod_boleto, dt_emissãoNF, dt_emissãoBT, dt_operacao, cliente, nf_boleto, Banco,valor_Boleto, dt_vencimento, dt_pagamento from controleboletos where cod_boleto =?";
		return jdbcTemplate.queryForObject(sql, new Object[] { codigo },
				(rs, rowNum) -> new Boleto(rs.getInt("cod_boleto"), rs.getString("dt_emissãoNF"),
						rs.getString("dt_emissãoBT"), rs.getString("dt_operacao"), rs.getString("cliente"),
						rs.getString("nf_boleto"), rs.getString("Banco"), rs.getFloat("valor_Boleto"),
						rs.getString("dt_vencimento"), rs.getString("dt_pagamento")

				));
	}

	public int edit(Boleto boleto) {

		String query = "update controleboletos set dt_emissãoNF = ?, dt_emissãoBT = ?, dt_operacao = ? , cliente = ?, nf_boleto = ?, Banco = ?, valor_Boleto = ?, dt_vencimento = ?, dt_pagamento = ? where cod_boleto = ?";
		return jdbcTemplate.update(query, boleto.getDataEmissaoNF(), boleto.getDataEmissaoBoleto(),
				boleto.getDataOperacao(), boleto.getCliente(), boleto.getNfBoleto(), boleto.getBanco(),
				boleto.getValorBoleto(), boleto.getDataVencimento(), boleto.getDataPagamento(),
				boleto.getCodigoBoleto());

	}

	public int deleteById(long boleto2) {

		return jdbcTemplate.update("delete from controleboletos where cod_boleto =?", boleto2);

	}

}
