package br.com.gof.impostos;

import java.math.BigDecimal;

import br.com.gof.orcamento.Orcamento;

public class ICMS implements Imposto{

	@Override
	public BigDecimal calcularImposto(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}
