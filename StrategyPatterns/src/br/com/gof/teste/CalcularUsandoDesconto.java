package br.com.gof.teste;

import java.math.BigDecimal;

import br.com.gof.descontos.CalcularDesconto;
import br.com.gof.orcamento.Desconto;
import br.com.gof.orcamento.Orcamento;

public class CalcularUsandoDesconto {

	public static void main(String[] args) {
		
		Orcamento primeiroProduto = new Orcamento(new BigDecimal("1999"),10);
		Orcamento segundoProduto = new Orcamento(new BigDecimal("1.90"),3);
		
		CalcularDesconto calcular = new CalcularDesconto();
		System.out.println(calcular.calcularDesconto(segundoProduto));
		
		
		
	}
	
}
