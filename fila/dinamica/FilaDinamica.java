package fila.dinamica;

import fila.FilaInterface;

public class FilaDinamica implements FilaInterface {
	private Elemento cabeca;
	private Elemento cauda;

	public FilaDinamica() {
		cabeca = cauda = null;
	}
	
	public boolean isEmpty() {
		return cabeca == null && cauda == null;
	}

	public void add(Object valor) throws Exception {
		System.out.println("Adicionando " + valor);
	    
		Elemento elemento = new Elemento(valor);
		
		if (cauda != null) {
			cauda.setProximo(elemento);
		}
		
		cauda = elemento;
		
		if (cabeca == null) {
			cabeca = cauda;
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
		Elemento elemento = cabeca;
		
		while (elemento != null) {
			System.out.println("Valor " + elemento.getValor());
			
			elemento = elemento.getProximo();
		}
	}
}
