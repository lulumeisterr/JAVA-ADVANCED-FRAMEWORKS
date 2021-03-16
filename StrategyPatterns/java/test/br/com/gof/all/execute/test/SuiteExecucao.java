package br.com.gof.all.execute.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.gof.descontos.CalcularDescontoTest;
import br.com.gof.descontos.CalcularImpostoTest;
import br.com.gof.descontos.CalcularMaisDeUmImposto;

/**
 * Classe responsavel por executar todos os testes
 * @author lucasrodriguesdonascimento
 *
 */
//@RunWith(Suite.class)
@SuiteClasses({
	CalcularImpostoTest.class,
	CalcularDescontoTest.class,
	CalcularMaisDeUmImposto.class
})
public class SuiteExecucao {

}
