package br.com.gof.impostos;

import java.math.BigDecimal;

import br.com.gof.orcamento.Orcamento;

public class ISS implements Imposto{

	BigDecimal maxValue = new BigDecimal("0");
	
	@Override
	public BigDecimal calcularImposto(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.6"));
	}

	@Override
	public BigDecimal calcularListaImposto(Orcamento orcamento) {
		
		int totals = 0;
		for (BigDecimal indice : orcamento.getOrcamentosValor()) {
			totals = totals += indice.intValue();
		}
		return new BigDecimal(totals).multiply(new BigDecimal("0.1"));
	}
}
