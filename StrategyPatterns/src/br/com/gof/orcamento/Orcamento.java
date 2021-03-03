package br.com.gof.orcamento;

import java.math.BigDecimal;

public class Orcamento {
	
	private BigDecimal valor;

	public Orcamento() {
		// TODO Auto-generated constructor stub
	}
	
	public Orcamento(BigDecimal valor) {
		this.valor = valor;
	}
	
	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
}
