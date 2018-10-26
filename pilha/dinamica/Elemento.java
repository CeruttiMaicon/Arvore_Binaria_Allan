package pilha.dinamica;

public class Elemento {
	private Elemento anterior;
	private Object valor;
	
	public Elemento(Object valor) {
		this.valor = valor;
	}

	public Elemento getAnterior() {
		return anterior;
	}

	public void setAnterior(Elemento anterior) {
		this.anterior = anterior;
	}

	public Object getValor() {
		return valor;
	}
}
