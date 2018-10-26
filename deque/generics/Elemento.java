package deque.generics;

public class Elemento<V> {
	private Elemento<V> proximo,anterior;
	private V valor;

	public Elemento(V valor) {
		this.valor = valor;
	}

	public void setProximo(Elemento<V> elemento) {
		proximo = elemento;
	}
	
	public void setAnterior(Elemento<V> elemento) {
		anterior = elemento;
	}

	public Elemento<V> getProximo() {
		return proximo;
	}
	
	public Elemento<V> getAnterior() {
		return anterior;
	}
	
	public V getValor() {
		return valor;
	}
}
