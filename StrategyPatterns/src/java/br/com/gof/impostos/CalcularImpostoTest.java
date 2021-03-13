package br.com.gof.impostos;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import java.math.BigDecimal;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

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

		// Verificacao usando lib Hamcrest

		// Usando metodo (is) static
		Assert.assertThat(new BigDecimal("10.0"),is(equalTo(resultado)));
		
		//Negacao
		Assert.assertThat(resultado,CoreMatchers.is(CoreMatchers.not(new BigDecimal("10.1"))));
		
		Assert.assertThat(orcamento.getValor(),CoreMatchers.is(CoreMatchers.not("0")));
		//Assert.assertTrue(!orcamento.getValor().equals(new BigDecimal("0")));

	}

}
