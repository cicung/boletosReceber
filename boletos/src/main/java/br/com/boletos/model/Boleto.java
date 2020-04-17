package br.com.boletos.model;

public class Boleto {

	private int codigoBoleto;
	public String dataEmissaoNF;
	public String dataEmissaoBoleto;
	public String dataOperacao;
	public String cliente;
	public String nfBoleto;
	public String banco;
	public float valorBoleto;
	public String dataVencimento;
	public String dataPagamento;

	public Boleto() {

	}

	public Boleto(int codigoBoleto, String dataEmissaoNF, String dataEmissaoBoleto, String dataOperacao, String cliente,
			String nfBoleto, String banco, float valorBoleto, String dataVencimento, String dataPagamento) {
		super();
		this.codigoBoleto = codigoBoleto;
		this.dataEmissaoNF = dataEmissaoNF;
		this.dataEmissaoBoleto = dataEmissaoBoleto;
		this.dataOperacao = dataOperacao;
		this.cliente = cliente;
		this.nfBoleto = nfBoleto;
		this.banco = banco;
		this.valorBoleto = valorBoleto;
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}

	public int getCodigoBoleto() {
		return codigoBoleto;
	}

	public void setCodigoBoleto(int codigoBoleto) {
		this.codigoBoleto = codigoBoleto;
	}

	public String getDataEmissaoNF() {
		return dataEmissaoNF;
	}

	public void setDataEmissaoNF(String dataEmissaoNF) {
		this.dataEmissaoNF = dataEmissaoNF;
	}

	public String getDataEmissaoBoleto() {
		return dataEmissaoBoleto;
	}

	public void setDataEmissaoBoleto(String dataEmissaoBoleto) {
		this.dataEmissaoBoleto = dataEmissaoBoleto;
	}

	public String getDataOperacao() {
		return dataOperacao;
	}

	public void setDataOperacao(String dataOperacao) {
		this.dataOperacao = dataOperacao;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getNfBoleto() {
		return nfBoleto;
	}

	public void setNfBoleto(String nfBoleto) {
		this.nfBoleto = nfBoleto;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public float getValorBoleto() {
		return valorBoleto;
	}

	public void setValorBoleto(float valorBoleto) {
		this.valorBoleto = valorBoleto;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

}
