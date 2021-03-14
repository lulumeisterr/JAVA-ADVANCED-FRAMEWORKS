package br.com.gof.impostos;

import java.math.BigDecimal;

import br.com.gof.orcamento.Orcamento;

public class ICMS implements Imposto{


	@Override
	public BigDecimal calcularImposto(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	public BigDecimal calcularListaImposto(Orcamento orcamento) throws Exception {
		
		int totals = 0;
		for (BigDecimal indice : orcamento.getOrcamentosValor()) {
			if(indice.compareTo(new BigDecimal("0")) == 0) {
				throw new Exception("Valor do ICMS NAO PODE SER 0");
			}
			totals = totals += indice.intValue();
		}
		return new BigDecimal(totals).multiply(new BigDecimal("0.1"));
	}

}
