package br.com.gof.teste;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import br.com.gof.descontos.CalcularDesconto;
import br.com.gof.orcamento.Orcamento;

public class CalcularDescontoTest {
	
	
	@Test
	public void teste() {
		
		//Cenario
		CalcularDesconto calcular = new CalcularDesconto();
		Orcamento primeiroProduto = new Orcamento(new BigDecimal("1999"),10);
		Orcamento segundoProduto = new Orcamento(new BigDecimal("300"),3);
		
		//Acao
		
		BigDecimal resultado = calcular.calcularDesconto(segundoProduto);
		
		//Verificacao
		
		Assert.assertTrue("resultado " + resultado, resultado.equals(new BigDecimal("61.50")));
		
		
	}
	
}
