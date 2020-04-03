package br.com.fiap.patterns.testaCalculo;

import br.com.fiap.patterns.controller.ImpostoController;
import br.com.fiap.patterns.model.Pis;
import br.com.fiap.patterns.view.TelaPis;

public class TesteCalculo {
	
	public static void main(String[] args) {
		
		Pis model = new Pis();
		TelaPis tela = new TelaPis();
		
		// A Tela ficara aguardando uma notifiacao do model
		model.addObserver(tela);
		
		ImpostoController controller = new ImpostoController(model, tela);
		tela.addController(controller);
		
	}

}
