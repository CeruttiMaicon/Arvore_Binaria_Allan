package deque;

public class Elemento {
	private Elemento proximo,anterior;
	private Object valor;

	public Elemento(Object valor) {
		this.valor = valor;
	}

	public void setProximo(Elemento elemento) {
		proximo = elemento;
	}
	
	public void setAnterior(Elemento elemento) {
		anterior = elemento;
	}

	public Elemento getProximo() {
		return proximo;
	}
	
	public Elemento getAnterior() {
		return anterior;
	}
	
	public Object getValor() {
		return valor;
	}
}
