package br.com.gof.impostos;

import java.math.BigDecimal;

import br.com.gof.orcamento.Orcamento;

public class CalcularImpostos {
	
	/*
	 * 
	 * Funcionalidaes que variam de acordo com informacao contendo varios
	 * ifs e elses
	 * 
	 * Qual problema desse metodo ?
	 * 
	 * sempre que houver impostos deve ser implementado nessa classe
	 * infinitamente ou seja comeca ficar dificil de dar manutencao na classe
	 * 
	 * 
	 */
//	public BigDecimal calcular(Orcamento orcamento , TipoImposto tipoImposto) {
//		
//		
//		switch (tipoImposto) {
//		case ICMS:
//			return orcamento.getValor().multiply(new BigDecimal("0.1"));
//
//			
//		case ISS:
//			return orcamento.getValor().multiply(new BigDecimal("0.06"));
//		default:
//			return BigDecimal.ZERO;
//		}
//	
//	}
	
	
	/**
	 * Sempre que precisarmos realizar uma validacao e essa validacao varia com determinado parametro
	 * nos usamos o strategy para remover a redundancia de codigo(ifs e elses) e separar cada estrategia
	 * da funcionalidade em classes especificas podendo ser utilizadas por meio de contrato ou classes abstratas
	 * 
	 * @param orcamento
	 * @param imposto
	 * @return
	 * @throws Exception 
	 */
	public BigDecimal calcular(Orcamento orcamento , Imposto imposto) throws Exception {
		if(orcamento.getValor().compareTo(new BigDecimal("0")) == 0) {
			throw new Exception("Valor nao pode ser 0");
		}
		return imposto.calcularImposto(orcamento);
	}

}
