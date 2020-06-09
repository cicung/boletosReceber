package br.com.boletos.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.boot.autoconfigure.domain.EntityScan;

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
	private String dataEmissaoNF;
	private String dataEmissaoBoleto;
	private String dataOperacao;
	private String cliente;
	private String nfBoleto;
	private String banco;
	private Float valorBoleto;
	private String dataVencimento;
	private String dataPagamento;
	public String statusDoc;
	private Boolean selected;


	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}


}
