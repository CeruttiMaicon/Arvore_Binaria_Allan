package pilha.estatica;

import pilha.PilhaInterface;

public class PilhaEstatica implements PilhaInterface {
	private Object[] valores;
	private int topo;

	public PilhaEstatica(int capacidade) {
		valores = new Object[capacidade];
		topo = 0;
	}

	public boolean isEmpty() {
		return topo == 0;
	}

	public boolean isFull() {
		return topo == valores.length;
	}

	public void push(Object valor) throws Exception {
		if (this.isFull()) {
			throw new Exception("Pilha cheia");
		}
		
		System.out.println("Adicionando " + valor);
		valores[topo++] = valor;
	}

	public Object pop() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Pilha vazia");
		}
		
		Object valor = valores[--topo];
		valores[topo] = null;
		
		System.out.println("Removendo " + valor);
		return valor;
	}

	public void clear() {
		while (!this.isEmpty()) {
			try {
				this.pop();
			} catch (Exception e) { e.printStackTrace(); }
		}
	}

	public void list() {
		for (int i = 0; i < topo; i++) {
			System.out.println("Valor " + valores[i]);
		}
	}
}

