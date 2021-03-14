package br.com.gof.impostos;

import java.math.BigDecimal;

import br.com.gof.orcamento.Orcamento;

public interface Imposto {
	
	BigDecimal calcularImposto(Orcamento orcamento);
	
	BigDecimal calcularListaImposto(Orcamento orcamento) throws Exception;

}
