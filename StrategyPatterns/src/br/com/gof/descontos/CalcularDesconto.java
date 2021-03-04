package br.com.gof.descontos;

import java.math.BigDecimal;

import br.com.gof.orcamento.Desconto;
import br.com.gof.orcamento.Orcamento;

public class CalcularDesconto {
	
	/**
	 * Utilizamos a cadeia de responsabilidade para evitar redundancias de condicoes
	 * no codigo , com a funcionalidade de ir verificando varias condicoes ate chegar no fim
	 * da corrente de condicoes
	 * @param orcamento
	 * @return
	 */
	public BigDecimal calcularDesconto(Orcamento orcamento) {
		
		Desconto desconto = new CalcularDescontoMaiorQueQuintenhos(
							new CalcularDescontoMaisDeCincoItems(
							new SemDesconto()));
		
		return desconto.calcular(orcamento);
	}

}
