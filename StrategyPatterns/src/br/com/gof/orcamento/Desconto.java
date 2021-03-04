package br.com.gof.orcamento;

import java.math.BigDecimal;

/**
 * Classe modelo
 * @author lucasrodriguesdonascimento
 *
 */
public abstract class Desconto {
	
	protected Desconto proximo;

	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public abstract BigDecimal calcular(Orcamento orcamento);
	

}
