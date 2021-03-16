package br.com.gof.testAsserts;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * Executar em ordem alfabetica os testes
 * @author lucasrodriguesdonascimento
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrdemTest{

	//Junit nao altera as variaveis estaticas
	public static int contador = 0;
	
	@Test
	public void inicializar() {
		contador = 1;
	}
	
	@Test
	public void verificar() {
		Assert.assertEquals(1,contador);
	}
	
}
