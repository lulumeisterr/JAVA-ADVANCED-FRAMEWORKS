package br.com.gof.teste;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import br.com.gof.impostos.CalcularImpostos;
import br.com.gof.impostos.ICMS;
import br.com.gof.impostos.Imposto;
import br.com.gof.orcamento.Orcamento;

public class CalcularImpostoTest {

	@Test
	public void teste() {
		
		/**
		 * FIRST
		 * F = Fast
		 * I = Independente (Um teste nao pode depender de outro
		 * R = Repetitivel (Um teste pode ser executado N vezes)
		 * S = Auto verificado ( Um teste deve saber quando falha e quando funciona)
		 * T = Timely
		 * 
		 * 
		 * ============================================================================
		 * 
		 * 
		 */
		
		// Cenario
		
		CalcularImpostos calculo = new CalcularImpostos();
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		
		// Acao
		
		BigDecimal resultado = calculo.calcular(orcamento, new ICMS());
		
		// Verificacao
		
		Assert.assertTrue(resultado.equals(new BigDecimal("10.0")));
		Assert.assertTrue(!orcamento.getValor().equals(new BigDecimal("0")));
		Assert.assertTrue(new ICMS() instanceof Imposto);

	}
	
}
