package fila.estatica;

import fila.FilaInterface;

public class FilaEstatica implements FilaInterface {
	private Object[] valores;
	private int cabeca;
	private int cauda;

	public FilaEstatica(int capacidade) {
		valores = new Object[capacidade];
		cabeca  = cauda = -1;
	}
	
	public boolean isEmpty() {
		return cabeca == -1 && cauda == -1;
	}

	public boolean isFull() {
		  return (cauda + 1) % valores.length == cabeca;
	}
	
	public void add(Object valor) throws Exception {
		if (this.isFull()) {
			throw new Exception("Fila cheia");
		}
		
		System.out.println("Adicionando " + valor);
	    
		cauda = (cauda + 1) % valores.length;
	    valores[cauda] = valor;
	    
	    if (cabeca == -1) {
	    	cabeca = cauda;
	    }
	}
	
	public Object remove() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Fila vazia");
		}
		
		Object valor = valores[cabeca];
		
		if (cabeca == cauda) {
			cabeca = cauda = -1;
		} else {
	    	cabeca = (cabeca + 1) % valores.length;
		}
		
	    System.out.println("Removendo " + valor);
	    return valor; 
	}
	
	public void clear() {
		while (!this.isEmpty()) {
			try {
				this.remove();
			} catch (Exception e) { e.printStackTrace(); }
		}
	}
	
	public void list() {
		if (!this.isEmpty()) {
			int i;
		
			for (i = cabeca; i != cauda; i = (i+1) % valores.length) {
				System.out.println("Valor " + valores[i]);
			}
		
			System.out.println("Valor " + valores[i]);
		}
	}
}
