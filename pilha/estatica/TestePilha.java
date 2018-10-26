package pilha.estatica;

import pilha.PilhaInterface;

public class TestePilha {
	public static void main(String[] args) throws Exception {
		PilhaInterface pilha = new PilhaEstatica(10);

		pilha.push(20.0);
		pilha.push(20.8);
		pilha.push(20.3);
		pilha.push(44.5);
		pilha.push(33.33);
		pilha.push(20.9);
		
		pilha.list();
		
		pilha.pop();
		pilha.pop();
		
		pilha.list();
		
		pilha.clear();
	}
}