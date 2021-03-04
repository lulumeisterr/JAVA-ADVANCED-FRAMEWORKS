package br.com.gof.descontos;

import java.math.BigDecimal;

import br.com.gof.orcamento.Desconto;
import br.com.gof.orcamento.Orcamento;

public class SemDesconto extends Desconto{
	
	public SemDesconto() {
		super(null);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}
