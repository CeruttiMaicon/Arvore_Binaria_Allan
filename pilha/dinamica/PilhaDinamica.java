package pilha.dinamica;

import pilha.PilhaInterface;

public class PilhaDinamica implements PilhaInterface {
	private Elemento topo;

	public boolean isEmpty() {
		return topo == null;
	}
	
	public void push(Object valor) throws Exception {
		System.out.println("Adicionando " + valor);
		
		Elemento elemento = new Elemento(valor);
		elemento.setAnterior(topo);
		
		topo = elemento;
	}
	
	public Object pop() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("Pilha vazia");
		}
		
		Object valor = topo.getValor();
		topo = topo.getAnterior();
		
		System.out.println("Removendo " + valor);
		return valor;
	}
	
	public void clear() {
		while (!this.isEmpty()) {
			try {
				this.pop();
			} catch (Exception e) {
				break;
			}
		}
	}
	
	public void list() {
		Elemento elemento = topo;
		
		while (elemento != null) {
			System.out.println("Valor: " + elemento.getValor());
			elemento = elemento.getAnterior();
		}
	}
}

