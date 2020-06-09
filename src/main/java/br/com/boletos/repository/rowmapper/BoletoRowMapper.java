package br.com.boletos.repository.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.boletos.model.Boleto;

public class BoletoRowMapper implements RowMapper<Boleto> {

	@Override
	public Boleto mapRow(ResultSet rs, int rowNum) throws SQLException {

		return new Boleto(rs.getInt("cod_boleto"), rs.getString("dt_emissãoNF"), rs.getString("dt_emissãoBT"),
				rs.getString("dt_operacao"), rs.getString("cliente"), rs.getString("nf_boleto"), rs.getString("Banco"),
				rs.getFloat("valor_Boleto"), rs.getString("dt_vencimento"), rs.getString("dt_pagamento"), rs.getString("status_Doc"),  null
		);
	}
}
