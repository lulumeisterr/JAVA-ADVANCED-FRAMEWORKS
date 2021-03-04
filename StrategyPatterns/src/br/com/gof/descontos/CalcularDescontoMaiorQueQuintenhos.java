package br.com.gof.descontos;

import java.math.BigDecimal;

import br.com.gof.orcamento.Desconto;
import br.com.gof.orcamento.Orcamento;

public class CalcularDescontoMaiorQueQuintenhos extends Desconto{

	public CalcularDescontoMaiorQueQuintenhos(Desconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0 ){
			return orcamento.getValor().multiply(new BigDecimal("0.05"));
		}

		return proximo.calcular(orcamento);

	}

}
