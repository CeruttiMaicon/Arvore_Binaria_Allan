package deque;

public class Deque implements DequeInterface {
	private Elemento cabeca;
	private Elemento cauda;

	public Deque() {
		cabeca = cauda = null;
	}

	public boolean isEmpty() {
		return cabeca == null && cauda == null;
	}

	public void add(Object valor) {
		System.out.println("Adicionando " + valor);
		Elemento elemento = new Elemento(valor);

		if (cauda != null) {
			cauda.setProximo(elemento);
		}

		elemento.setAnterior(cauda);
		cauda = elemento;

		if (cabeca == null) {
			cabeca = cauda;
		}
	}

	public void addFirst(Object valor) {
		System.out.println("Adicionando " + valor);
		Elemento elemento = new Elemento(valor);

		if (cabeca != null) {
			cabeca.setAnterior(elemento);
		}

		elemento.setProximo(cabeca);
		cabeca = elemento;

		if (cauda == null) { 
			cauda = cabeca;
		}
	}
	public Object remove() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Fila vazia");
		}

		Object valor = cabeca.getValor();
		cabeca = cabeca.getProximo();

		if (cabeca == null) {
			cauda = null;
		} else {
			cabeca.setAnterior(null);
		}

		System.out.println("Removendo " + valor);
		return valor; 
	}

	public Object removeLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Fila vazia");
		}

		Object valor = cauda.getValor();
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

	public void list() {
		Elemento elemento = cabeca;

		while (elemento != null) {
			System.out.println("Valor " + elemento.getValor());
			elemento = elemento.getProximo();
		}
	}
}
