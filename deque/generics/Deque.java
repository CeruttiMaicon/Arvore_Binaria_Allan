package deque.generics;

public class Deque<V> implements DequeInterface<V> {
	protected Elemento<V> cabeca;
	protected Elemento<V> cauda;

	public Deque() {
		cabeca = cauda = null;
	}

	public boolean isEmpty() {
		return cabeca == null && cauda == null;
	}
	
	public void add(V valor) {
		System.out.println("Adicionando " + valor);
		Elemento<V> elemento = new Elemento<V>(valor);
		
		if (cauda != null) {
			cauda.setProximo(elemento);
		}
		
		elemento.setAnterior(cauda);
		cauda = elemento;
		
		if (cabeca == null) {
			cabeca = cauda;
		}
	}
	
	public void addFirst(V valor) {
		System.out.println("Adicionando " + valor);
		Elemento<V> elemento = new Elemento<V>(valor);
		
		if (cabeca != null) {
			cabeca.setAnterior(elemento);
		}
		
		elemento.setProximo(cabeca);
		cabeca = elemento;
		
		if (cauda == null) { 
			cauda = cabeca;
		}
	}
	public V remove() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Fila vazia");
		}
		
		V valor = cabeca.getValor();
		cabeca = cabeca.getProximo();
		
		if (cabeca == null) {
			cauda = null;
		} else {
			cabeca.setAnterior(null);
		}
		
		System.out.println("Removendo " + valor);
		return valor; 
	}
	
	public V removeLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Fila vazia");
		}
		
		V valor = cauda.getValor();
		cauda = cauda.getAnterior();
		
		if (cauda == null) {
			cabeca = null;
		} else {
			cauda.setProximo(null);
		}
		
		System.out.println("Removendo " + valor);
		return valor; 
	}
	
	public void clear() {
		while (!this.isEmpty()) {
			try {
				this.remove();
			} catch (Exception e) { 
				break;
			}
		}
	}
	
	public void list(FunctionInterface<V> callback) {
		Elemento<V> elemento = cabeca;

		while (elemento != null) {
			callback.callback(elemento.getValor());
			elemento = elemento.getProximo();
		}
	}
}
