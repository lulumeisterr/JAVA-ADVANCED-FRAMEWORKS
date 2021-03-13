

package br.com.gof.orcamento;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;
	private Integer quantidade;

	public Orcamento() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Orcamento(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Orcamento(BigDecimal valor) {
		this.valor = valor;
	}
	
	public Orcamento(BigDecimal valor, Integer quantidade) {
		super();
		this.valor = valor;
		this.quantidade = quantidade;
	}
		
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((quantidade == null) ? 0 : quantidade.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Orcamento))
			return false;
		Orcamento other = (Orcamento) obj;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}

	
		
}
