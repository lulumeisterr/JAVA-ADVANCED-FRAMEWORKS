package br.com.fiap.patterns.view;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;

public class TelaPis implements TelaImposto , Observer{
	
	private TextField txtValor;
	private Button btnCalcular;
	
	/*
	 * Dizendo que este controller vai tratar o evento do botao
	 */
	public void addController(ActionListener controller) {
		btnCalcular.addActionListener(controller);
	}
	
	public TelaPis() {
		Frame frame = new Frame("Calcular Imposto Pis");
		frame.add("North",new Label("Valor para calcular"));
		
		txtValor = new TextField();
		frame.add("Center",txtValor);
		
		Panel panel = new Panel();
		btnCalcular = new Button("Calcular");
		
		panel.add(btnCalcular);
		frame.add("South", panel);
		
		frame.addWindowListener(new CloseListener());
		frame.setSize(200,150);
		frame.setLocation(100,100);
		frame.setVisible(true);
	}

	@Override
	public float getValor() {
		return Float.parseFloat(txtValor.getText());
	}
	
	public static class CloseListener extends WindowAdapter {
		public void windowClosing(WindowEvent event) {
			event.getWindow().setVisible(false);
			System.exit(0);
		}
	}
	
	/**
	 * Este metodo sera acionado no momento em que for aviso a alteracao e notificar a alteracao
	 * este metodo sera acionado com os valores
	 */
	@Override
	public void update(Observable model, Object estadoModel) {
		// Recuperando a classe e exibindo o valor
		String msg = model.getClass() + " " + estadoModel;
		JOptionPane.showMessageDialog(null, msg);
	}

	
	
}
