package br.com.fiap.patterns.model;

import java.util.Observable;

import br.com.fiap.conf.ConfigSingleton;

/**
 *  Ação notificatoria que nos permite observar comportamentos que acontecem no sistema e 
 *  repassar para todas as ações que estao esperando a resposta de algo.
 * @author lrodrina
 *
 */
public class Pis extends Observable  implements Imposto {

	private float aliquota;
	private float valorPis;
	
	
	// Singleton 
	public Pis() {
		aliquota = Float.parseFloat(ConfigSingleton.getInstance().getProperty("aliquota"));
	}
	
	/**
	 * Utilizando setChanged() para por este metodo em modo de observação e utilizando
	 * o recurso notify para exibir o valor alterado
	 */
	@Override
	public void calcularImposto(float valor) {
		setChanged();
		valorPis = valor * aliquota;
		notifyObservers(valorPis);
	}

	public float getAliquota() {
		return aliquota;
	}

	public float getValorPis() {
		return valorPis;
	}
	
}
