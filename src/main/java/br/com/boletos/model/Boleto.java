package br.com.boletos.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Boleto {

	private Integer codigoBoleto;
	public String dataEmissaoNF;
	public String dataEmissaoBoleto;
	public String dataOperacao;
	public String cliente;
	public String nfBoleto;
	public String banco;
	public Float valorBoleto;
	public String dataVencimento;
	public String dataPagamento;

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
