package br.com.gof.orcamento;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;
	private Integer quantidade;

	public Orcamento() {
		// TODO Auto-generated constructor stub
	}
	
	public Orcamento(BigDecimal valor) {
		this.valor = valor;
	}
	
	public Orcamento(BigDecimal valor, Integer quantidade) {
		super();
		this.valor = valor;
		this.quantidade = quantidade;
	}
		
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
}
