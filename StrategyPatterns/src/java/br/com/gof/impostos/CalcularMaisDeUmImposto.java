package br.com.gof.impostos;

import java.math.BigDecimal;
import java.util.Arrays;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import br.com.gof.orcamento.Orcamento;


public class CalcularMaisDeUmImposto {

	private CalcularImpostos calculoImp = new CalcularImpostos();
	BigDecimal [] listaDeImposto = null;
	
	@Rule
	public ErrorCollector error = new ErrorCollector();
	
	@Before
	public void carregarDados() {
		BigDecimal [] carregandoArray = {new BigDecimal(100)};
		calculoImp = new  CalcularImpostos();
		listaDeImposto = carregandoArray;
	}
	
	@Test
	public void calcularMaisOrcamento() {
	
		Orcamento orcamento = new Orcamento(Arrays.asList(listaDeImposto));
		
		try {
			BigDecimal resultado = calculoImp.calcular(orcamento, new ICMS());
			error.checkThat(new BigDecimal("10.0"), CoreMatchers.is(resultado));
			
		} catch (Exception e) {
			Assert.assertThat(e.getMessage(), CoreMatchers.is("O Valor nao pode ser 0"));
		}
		
	}
	
	
}
