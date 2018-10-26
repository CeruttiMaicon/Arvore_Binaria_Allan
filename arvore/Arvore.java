package arvore;

import java.util.ArrayList;
import java.util.List;

public class Arvore<T> {
	public No<T> raiz;
	
	public void profundidade(No<T> no) {
		System.out.println(no.valor);
		
		for (No<T> filho : no.filhos) {
			this.profundidade(filho);
		}
	}
	
	public void largura(No<T> no) {
		List<No<T>> fila = new ArrayList<No<T>>();
		fila.add(no);
		
		while (!fila.isEmpty()) {
			no = fila.remove(0);
			System.out.println(no.valor);
		
			fila.addAll(no.filhos);
		}
	}
	
	public static void main(String[] args) {
		No<Integer> n1 = new No<Integer>(1);
		No<Integer> n2 = new No<Integer>(2);
		No<Integer> n3 = new No<Integer>(3);
		No<Integer> n4 = new No<Integer>(4);
		No<Integer> n5 = new No<Integer>(5);
		No<Integer> n6 = new No<Integer>(6);
		
		n1.filhos.add(n2);
		n1.filhos.add(n5);
		n2.pai = n1;
		n5.pai = n1;
		
		n2.filhos.add(n3);
		n2.filhos.add(n4);
		n3.pai = n2;
		n4.pai = n2;
		
		n5.filhos.add(n6);
		n6.pai = n5;
		
		Arvore<Integer> a = new Arvore<Integer>();
		a.raiz = n1;
		
		a.largura(n1);
	}
}
