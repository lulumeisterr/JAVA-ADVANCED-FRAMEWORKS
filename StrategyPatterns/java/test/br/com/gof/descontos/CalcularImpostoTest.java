package br.com.gof.descontos;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import java.math.BigDecimal;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExpectedException;

import br.com.gof.impostos.CalcularImpostos;
import br.com.gof.impostos.ICMS;
import br.com.gof.orcamento.Orcamento;

/**
 * FIRST
 * F = Fast
 * I = Independente (Um teste nao pode depender de outro) // Isolado
 * R = Repetitivel (Um teste pode ser executado N vezes)
 * S = Auto verificado ( Um teste deve saber quando falha e quando funciona)
 * T = Timely 
 */

public class CalcularImpostoTest {

	@Rule
	public ErrorCollector error = new ErrorCollector();

	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	CalcularImpostos calculo = new CalcularImpostos();
	
	/**
	 * Executar ou carregar acoes antes
	 */
	@Before
	public void setup() {
		calculo = new CalcularImpostos();
	}
	
	@Test
	public void teste() throws Exception {

		// Cenario
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));

		// Acao

		BigDecimal resultado;

		resultado = calculo.calcular(orcamento, new ICMS());

		// Verificacao usando lib Hamcrest

		// Usando metodo (is) static
		//Assert.assertThat(new BigDecimal("10.0"),is(equalTo(resultado)));

		error.checkThat(new BigDecimal("10.0"),is(equalTo(resultado)));

		//Negacao
		//Assert.assertThat(resultado,CoreMatchers.is(CoreMatchers.not(new BigDecimal("10.1"))));

		error.checkThat(resultado,CoreMatchers.is(CoreMatchers.not(new BigDecimal("10.5"))));


		//Assert.assertThat(orcamento.getValor(),CoreMatchers.is(CoreMatchers.not("0")));
		//Assert.assertTrue(!orcamento.getValor().equals(new BigDecimal("0")));

		error.checkThat(orcamento.getValor(),CoreMatchers.is(CoreMatchers.not("0")));

	}



	/**
	 * Testando Elegante Exceptions

	 */

	@Test(expected = Exception.class)
	public void testeCalculo_semValorOcamento() throws Exception {

		// Cenario
		Orcamento orcamento = new Orcamento(new BigDecimal("0"));

		// Acao
		//Assert.fail("Deveria lancar exception");
		
		BigDecimal resultado = calculo.calcular(orcamento, new ICMS());
	}


	@Test
	public void testeCalculo_semValorOcamento2(){

		// Cenario
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));

		// Acao

		BigDecimal resultado;	
		try {
			resultado = calculo.calcular(orcamento, new ICMS());
		}catch (Exception e) {
			Assert.assertThat(e.getMessage(), CoreMatchers.is("O Valor nao pode ser 0"));
		}

	}

//	@Ignore
//	@Test()
//	public void testeCalculo_semValorOcamento3() throws Exception {
//
//		// Cenario
//		Orcamento orcamento = new Orcamento(new BigDecimal("0"));
//
//		// Acao
//
//		exception.expect(Exception.class);
//		exception.expectMessage("O Valor nao pode ser 0");
//		
//		BigDecimal resultado = calculo.calcular(orcamento, new ICMS());	
//	}
}
