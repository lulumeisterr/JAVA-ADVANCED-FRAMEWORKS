package br.com.fiap.patterns.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.fiap.patterns.model.Imposto;
import br.com.fiap.patterns.view.TelaImposto;

/**
 * ActionLister aguarda o momento do click do botao
 * @author lrodrina
 *
 */
public class ImpostoController implements ActionListener {

	private Imposto model;
	private TelaImposto tela;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		model.calcularImposto(tela.getValor());
	}
	
	/*
	 * Strategy , permite me adicionar qualquer classe que implementa este imposto ou seja
	 * dessa forma eu posso ter diversas maneiras de exibição de resultado ou de calculo de imposto
	 */
	
	public ImpostoController(Imposto model , TelaImposto tela) {
		this.model = model;
		this.tela = tela;
	}
}
