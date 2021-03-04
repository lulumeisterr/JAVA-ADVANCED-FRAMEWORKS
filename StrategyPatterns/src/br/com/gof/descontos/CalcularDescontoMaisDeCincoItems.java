package br.com.gof.descontos;

import java.math.BigDecimal;

import br.com.gof.orcamento.Desconto;
import br.com.gof.orcamento.Orcamento;

public class CalcularDescontoMaisDeCincoItems extends Desconto{

	public CalcularDescontoMaisDeCincoItems(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if(orcamento.getQuantidade() > 5){
			return orcamento.getValor().multiply(new BigDecimal("0.07"));
		}

		return proximo.calcular(orcamento);

	}
}
