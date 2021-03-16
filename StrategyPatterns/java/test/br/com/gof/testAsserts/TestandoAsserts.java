package br.com.gof.testAsserts;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import br.com.gof.orcamento.Orcamento;

public class TestandoAsserts {


	/**
	 * Testando expressoes boleanas
	 */

	@Test
	public void booleanTest() {
		Assert.assertTrue(true);

		//Testar expressoes falsas
		//Assert.assertTrue(!false);
	}


	/**
	 * Usando AssertEquals para fazer comparacoes
	 */
	@Test
	public void assertEquals() {
		Assert.assertEquals(1,1);

	}

	/**
	 * AssertEquals usando casas decimais
	 */

	@Test
	public void asserEqualsDecimais() {
		/*
		 * Quando for utilizar comparacoes com casas 
		 * decimas deve-se colocar uma margem de erro para casas decimais
		 */

		Assert.assertEquals(0.54400, 0.54001,00.1);

	}

	/**
	 * AssertEquals Para numeros inteiros
	 */

	@Test
	public void assertInteiros() {

		int i = 5;
		Integer i2 = 5;
		
		Assert.assertEquals(Integer.valueOf(i), i2);

	}
	
	
	/**
	 * AssertEquals Para Strings
	 */

	@Test
	public void assertEqualsStrings() {
		
		Assert.assertEquals("bola", "bola");
		Assert.assertTrue("Bola".equalsIgnoreCase("bola"));
		
		//Comparacao de objeto
		
		Orcamento orcamento1 = new Orcamento(new BigDecimal("2"));
		Orcamento orcamento2 = new Orcamento(new BigDecimal("2"));
		
		//Instancia
		Orcamento orcamento3 = orcamento2;
		
		
		Assert.assertEquals(orcamento1, orcamento2);
		
		// Comparando instancias de objeto
		Assert.assertSame(orcamento3, orcamento2);

	}
	
	
	/**
	 * Comparacao de objetos nullos
	 */

	@Test
	public void assertEqualsNulls() {
	
		Orcamento orcamento1 = null;
		Orcamento orcamento2 = new Orcamento(new BigDecimal("2"));
		
		//Verificar se sao diferentes
		Assert.assertNotEquals("bola", "bolas");
	
		//Objetos vazios
		Assert.assertNull(orcamento1);
		
		//Objetos nao vazios
		Assert.assertNotNull(orcamento2);

	}

}
