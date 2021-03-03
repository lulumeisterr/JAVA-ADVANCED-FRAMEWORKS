package br.com.gof.teste;

import java.math.BigDecimal;

import br.com.gof.impostos.CalcularImpostos;
import br.com.gof.impostos.ICMS;
import br.com.gof.orcamento.Orcamento;

public class Main {

	public static void main(String[] args) {

		CalcularImpostos calculo = new CalcularImpostos();
		System.out.println(calculo.calcular(new Orcamento(new BigDecimal("100")), new ICMS()));

	}

}
