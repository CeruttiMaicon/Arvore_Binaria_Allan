package fila.dinamica;

public class Elemento {
	private Elemento proximo;
	private Object valor;
	
	public Elemento(Object valor) {
		this.valor = valor;
	}

	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}

	public Object getValor() {
		return valor;
	}
}
